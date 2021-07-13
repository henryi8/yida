package com.github.zhaoxny.yida.pms.dto.resp;


import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 商品分类对应属性信息
 * @Author Henry
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsProductAttrInfo {
    @ApiModelProperty("商品属性ID")
    private Long attributeId;
    @ApiModelProperty("商品属性分类ID")
    private Long attributeCategoryId;
}
