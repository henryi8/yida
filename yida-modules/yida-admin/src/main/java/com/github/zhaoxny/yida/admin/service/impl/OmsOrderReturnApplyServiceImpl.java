package com.github.zhaoxny.yida.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.zhaoxny.yida.admin.service.OmsOrderReturnApplyService;
import com.github.zhaoxny.yida.model.dto.example.OmsOrderReturnApplyExample;
import com.github.zhaoxny.yida.model.dto.req.OmsReturnApplyQueryParam;
import com.github.zhaoxny.yida.model.dto.req.OmsUpdateStatusParam;
import com.github.zhaoxny.yida.model.dto.resp.OmsOrderReturnApplyResult;
import com.github.zhaoxny.yida.model.entity.OmsOrderReturnApply;
import com.github.zhaoxny.yida.model.mapper.OmsOrderReturnApplyMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * 订单退货管理Service
 * @Author Henry
 */
@Service
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService {
    @Autowired
    private OmsOrderReturnApplyMapper returnApplyMapper;

    @Override
    public Page<OmsOrderReturnApply> getPage(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum) {
        Long id = queryParam.getId();
        Integer status = queryParam.getStatus();
        String handleMan = queryParam.getHandleMan();
        String receiverKeyword = queryParam.getReceiverKeyword();
        String createTime = queryParam.getCreateTime();
        String handleTime = queryParam.getHandleTime();

        Page<OmsOrderReturnApply> query = new Page<>(pageNum, pageSize);
        QueryWrapper<OmsOrderReturnApply> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(id != null, "id", id);
        queryWrapper.eq(status != null, "status", status);
        queryWrapper.eq(StringUtils.isNotBlank(handleMan), "handle_man", handleMan);
        if (StringUtils.isNotBlank(receiverKeyword)) {
            queryWrapper.and(ew -> ew.like("return_name", receiverKeyword).or()
                    .like("return_phone", receiverKeyword));
        }
        queryWrapper.likeLeft(StringUtils.isNotBlank(createTime), "create_time", createTime);
        queryWrapper.likeLeft(StringUtils.isNotBlank(handleTime), "handle_time", handleTime);
        return returnApplyMapper.selectPage(query, queryWrapper);
    }

    @Override
    public int delete(List<Long> ids) {
        OmsOrderReturnApplyExample example = new OmsOrderReturnApplyExample();
        example.createCriteria().andIdIn(ids).andStatusEqualTo(3);
        return returnApplyMapper.deleteByExample(example);
    }

    @Override
    public int updateStatus(Long id, OmsUpdateStatusParam statusParam) {
        Integer status = statusParam.getStatus();
        OmsOrderReturnApply returnApply = new OmsOrderReturnApply();
        if (status.equals(1)) {
            //确认退货
            returnApply.setId(id);
            returnApply.setStatus(1);
            returnApply.setReturnAmount(statusParam.getReturnAmount());
            returnApply.setCompanyAddressId(statusParam.getCompanyAddressId());
            returnApply.setHandleTime(new Date());
            returnApply.setHandleMan(statusParam.getHandleMan());
            returnApply.setHandleNote(statusParam.getHandleNote());
        } else if (status.equals(2)) {
            //完成退货
            returnApply.setId(id);
            returnApply.setStatus(2);
            returnApply.setReceiveTime(new Date());
            returnApply.setReceiveMan(statusParam.getReceiveMan());
            returnApply.setReceiveNote(statusParam.getReceiveNote());
        } else if (status.equals(3)) {
            //拒绝退货
            returnApply.setId(id);
            returnApply.setStatus(3);
            returnApply.setHandleTime(new Date());
            returnApply.setHandleMan(statusParam.getHandleMan());
            returnApply.setHandleNote(statusParam.getHandleNote());
        } else {
            return 0;
        }
        return returnApplyMapper.updateByPrimaryKeySelective(returnApply);
    }

    @Override
    public OmsOrderReturnApplyResult getItem(Long id) {
        return returnApplyMapper.getDetail(id);
    }
}
