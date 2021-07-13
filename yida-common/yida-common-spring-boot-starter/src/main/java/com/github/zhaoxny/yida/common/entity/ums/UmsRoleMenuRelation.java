package com.github.zhaoxny.yida.common.entity.ums;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;


/**
 * @Description 后台角色菜单关系表
 * @Author Henry
 * @Date  2021-07-05 22:53:17
 */
@Data
@TableName("ums_role_menu_relation")
public class UmsRoleMenuRelation extends Model<UmsRoleMenuRelation> {
	private static final long serialVersionUID = 1L;

	@TableId
	private Long id;
	/**
	 * 角色ID
	 */
	@TableField("role_id")
	private Long roleId;
	/**
	 * 菜单ID
	 */
	@TableField("menu_id")
	private Long menuId;

}
