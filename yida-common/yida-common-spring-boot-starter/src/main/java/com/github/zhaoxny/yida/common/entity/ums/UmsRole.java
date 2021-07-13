package com.github.zhaoxny.yida.common.entity.ums;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;


/**
 * @Description 后台用户角色表
 * @Author Henry
 * @Date  2021-07-05 22:53:16
 */
@Data
@TableName("ums_role")
public class UmsRole extends Model<UmsRole> {
	private static final long serialVersionUID = 1L;

	@TableId
	private Long id;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 后台用户数量
	 */
	@TableField("admin_count")
	private Integer adminCount;
	/**
	 * 创建时间
	 */
	@TableField("create_time")
	private Date createTime;
	/**
	 * 启用状态：0->禁用；1->启用
	 */
	private Integer status;
	private Integer sort;

}
