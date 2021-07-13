package com.github.zhaoxny.yida.oms.dto.resp;

import com.github.zhaoxny.yida.model.entity.OmsOrder;
import com.github.zhaoxny.yida.model.entity.OmsOrderItem;
import com.github.zhaoxny.yida.model.entity.OmsOrderOperateHistory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 订单详情信息
 * @Author Henry
 */
public class OmsOrderDetail extends OmsOrder {
    @Getter
    @Setter
    @ApiModelProperty("订单商品列表")
    private List<OmsOrderItem> orderItemList;
    @Getter
    @Setter
    @ApiModelProperty("订单操作记录列表")
    private List<OmsOrderOperateHistory> historyList;
}
