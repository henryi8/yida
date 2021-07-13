package com.github.zhaoxny.yida.oms.dto.resp;

import com.github.zhaoxny.yida.model.entity.OmsCompanyAddress;
import com.github.zhaoxny.yida.model.entity.OmsOrderReturnApply;
import io.swagger.annotations.ApiModelProperty;

/**
 * 申请信息封装
 * @Author Henry
 */
@Data
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @ApiModelProperty(value = "公司收货地址")
    private OmsCompanyAddress companyAddress;
}
