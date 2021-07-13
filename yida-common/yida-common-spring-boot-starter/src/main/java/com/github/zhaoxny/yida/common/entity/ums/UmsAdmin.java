package com.github.zhaoxny.yida.common.entity.ums;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;


/**
 * @Description 后台用户表
 * @Author Henry
 * @Date  2021-07-05 22:53:17
 */
@Data
@TableName("ums_admin")
public class UmsAdmin extends Model<UmsAdmin> {
	private static final long serialVersionUID = 1L;

	@TableId
	private Long id;
	private String username;
	private String password;
	/**
	 * 头像
	 */
	private String icon;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 昵称
	 */
	@TableField("nick_name")
	private String nickName;
	/**
	 * 备注信息
	 */
	private String note;
	/**
	 * 创建时间
	 */
	@TableField("create_time")
	private Date createTime;
	/**
	 * 最后登录时间
	 */
	@TableField("login_time")
	private Date loginTime;
	/**
	 * 帐号启用状态：0->禁用；1->启用
	 */
	private Integer status;

}
