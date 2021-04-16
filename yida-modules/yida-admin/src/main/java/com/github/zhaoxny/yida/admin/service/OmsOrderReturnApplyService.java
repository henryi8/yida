package com.github.zhaoxny.yida.admin.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.zhaoxny.yida.model.dto.req.OmsReturnApplyQueryParam;
import com.github.zhaoxny.yida.model.dto.req.OmsUpdateStatusParam;
import com.github.zhaoxny.yida.model.dto.resp.OmsOrderReturnApplyResult;
import com.github.zhaoxny.yida.model.entity.OmsOrderReturnApply;

import java.util.List;

/**
 * 退货申请管理Service
 * @Author Henry
 */
public interface OmsOrderReturnApplyService {
    /**
     * 分页查询申请
     */
    Page<OmsOrderReturnApply> getPage(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum);

    /**
     * 批量删除申请
     */
    int delete(List<Long> ids);

    /**
     * 修改申请状态
     */
    int updateStatus(Long id, OmsUpdateStatusParam statusParam);

    /**
     * 获取指定申请详情
     */
    OmsOrderReturnApplyResult getItem(Long id);
}
