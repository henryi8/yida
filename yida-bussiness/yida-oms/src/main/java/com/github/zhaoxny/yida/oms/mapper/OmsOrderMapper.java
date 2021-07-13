package com.github.zhaoxny.yida.oms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.zhaoxny.yida.model.dto.example.OmsOrderExample;
import com.github.zhaoxny.yida.ums.dto.req.OmsOrderDeliveryParam;
import com.github.zhaoxny.yida.ums.dto.req.OmsOrderQueryParam;
import com.github.zhaoxny.yida.model.dto.resp.OmsOrderDetail;
import com.github.zhaoxny.yida.model.entity.OmsOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OmsOrderMapper extends BaseMapper<OmsOrder> {
    long countByExample(OmsOrderExample example);

    int deleteByExample(OmsOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsOrder record);

    int insertSelective(OmsOrder record);

    List<OmsOrder> selectByExample(OmsOrderExample example);

    OmsOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);

    int updateByExample(@Param("record") OmsOrder record, @Param("example") OmsOrderExample example);

    int updateByPrimaryKeySelective(OmsOrder record);

    int updateByPrimaryKey(OmsOrder record);

    /**
     * 条件查询订单
     */
    List<OmsOrder> getList(@Param("queryParam") OmsOrderQueryParam queryParam);

    /**
     * 批量发货
     */
    int delivery(@Param("list") List<OmsOrderDeliveryParam> deliveryParamList);

    /**
     * 获取订单详情
     */
    OmsOrderDetail getDetail(@Param("id") Long id);

}