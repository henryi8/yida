package com.github.zhaoxny.yida.pms.dto.resp;

import com.github.zhaoxny.yida.model.entity.PmsProductAttribute;
import com.github.zhaoxny.yida.model.entity.PmsProductAttributeCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 包含有分类下属性的dto
 * @Author Henry
 */
public class PmsProductAttributeCategoryItem extends PmsProductAttributeCategory {
    @Getter
    @Setter
    @ApiModelProperty(value = "商品属性列表")
    private List<PmsProductAttribute> productAttributeList;
}
