package com.github.zhaoxny.yida.common.entity.ums;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;


/**
 * @Description 后台用户登录日志表
 * @Author Henry
 * @Date  2021-07-05 22:53:17
 */
@Data
@TableName("ums_admin_login_log")
public class UmsAdminLoginLog extends Model<UmsAdminLoginLog> {
	private static final long serialVersionUID = 1L;

	@TableId
	private Long id;
	@TableField("admin_id")
	private Long adminId;
	@TableField("create_time")
	private Date createTime;
	private String ip;
	private String address;
	/**
	 * 浏览器登录类型
	 */
	@TableField("user_agent")
	private String userAgent;

}
