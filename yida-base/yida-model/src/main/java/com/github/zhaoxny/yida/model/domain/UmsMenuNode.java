package com.github.zhaoxny.yida.model.domain;

import com.github.zhaoxny.yida.model.entity.UmsMenu;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 后台菜单节点封装
 *
 * @Author Henry
 */
@Data
public class UmsMenuNode extends UmsMenu {
    @ApiModelProperty(value = "子级菜单")
    private List<UmsMenuNode> children;
}
