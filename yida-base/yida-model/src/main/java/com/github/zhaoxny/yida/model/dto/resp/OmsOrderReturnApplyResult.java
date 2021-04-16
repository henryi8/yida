package com.github.zhaoxny.yida.model.dto.resp;

import com.github.zhaoxny.yida.model.entity.OmsCompanyAddress;
import com.github.zhaoxny.yida.model.entity.OmsOrderReturnApply;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 * @Author Henry
 */
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @Getter
    @Setter
    @ApiModelProperty(value = "公司收货地址")
    private OmsCompanyAddress companyAddress;
}
