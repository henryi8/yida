package com.github.zhaoxny.yida.oms.mapper;

import com.github.zhaoxny.yida.model.dto.example.OmsOrderOperateHistoryExample;
import com.github.zhaoxny.yida.model.entity.OmsOrderOperateHistory;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmsOrderOperateHistoryMapper {
    long countByExample(OmsOrderOperateHistoryExample example);

    int deleteByExample(OmsOrderOperateHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrderOperateHistory record);

    int insertSelective(OmsOrderOperateHistory record);

    List<OmsOrderOperateHistory> selectByExample(OmsOrderOperateHistoryExample example);

    OmsOrderOperateHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOrderOperateHistory record, @Param("example") OmsOrderOperateHistoryExample example);

    int updateByExample(@Param("record") OmsOrderOperateHistory record, @Param("example") OmsOrderOperateHistoryExample example);

    int updateByPrimaryKeySelective(OmsOrderOperateHistory record);

    int updateByPrimaryKey(OmsOrderOperateHistory record);
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<OmsOrderOperateHistory> orderOperateHistoryList);
}