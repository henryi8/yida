package com.github.zhaoxny.yida.common.entity.ums;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;


/**
 * @Description 后台用户和角色关系表
 * @Author Henry
 * @Date  2021-07-05 22:53:17
 */
@Data
@TableName("ums_admin_role_relation")
public class UmsAdminRoleRelation extends Model<UmsAdminRoleRelation> {
	private static final long serialVersionUID = 1L;

	@TableId
	private Long id;
	@TableField("admin_id")
	private Long adminId;
	@TableField("role_id")
	private Long roleId;

}
