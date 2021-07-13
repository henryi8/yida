package com.github.zhaoxny.yida.oms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.zhaoxny.yida.model.dto.example.OmsOrderReturnApplyExample;
import com.github.zhaoxny.yida.ums.dto.req.OmsReturnApplyQueryParam;
import com.github.zhaoxny.yida.model.dto.resp.OmsOrderReturnApplyResult;
import com.github.zhaoxny.yida.model.entity.OmsOrderReturnApply;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmsOrderReturnApplyMapper extends BaseMapper<OmsOrderReturnApply> {
    long countByExample(OmsOrderReturnApplyExample example);

    int deleteByExample(OmsOrderReturnApplyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderReturnApply record);

    int insertSelective(OmsOrderReturnApply record);

    List<OmsOrderReturnApply> selectByExample(OmsOrderReturnApplyExample example);

    OmsOrderReturnApply selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOrderReturnApply record, @Param("example") OmsOrderReturnApplyExample example);

    int updateByExample(@Param("record") OmsOrderReturnApply record, @Param("example") OmsOrderReturnApplyExample example);

    int updateByPrimaryKeySelective(OmsOrderReturnApply record);

    int updateByPrimaryKey(OmsOrderReturnApply record);
    /**
     * 查询申请列表
     */
    List<OmsOrderReturnApply> getList(@Param("queryParam") OmsReturnApplyQueryParam queryParam);

    /**
     * 获取申请详情
     */
    OmsOrderReturnApplyResult getDetail(@Param("id")Long id);
}