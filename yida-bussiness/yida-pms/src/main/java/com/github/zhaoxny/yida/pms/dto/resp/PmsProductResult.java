package com.github.zhaoxny.yida.pms.dto.resp;

import com.github.zhaoxny.yida.ums.dto.req.PmsProductParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 查询单个产品进行修改时返回的结果
 * @Author Henry
 */
public class PmsProductResult extends PmsProductParam {
    @Getter
    @Setter
    @ApiModelProperty("商品所选分类的父id")
    private Long cateParentId;
}
