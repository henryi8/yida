package com.github.zhaoxny.yida.common.entity.ums;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;


/**
 * @Description 后台资源表
 * @Author Henry
 * @Date  2021-07-05 22:53:17
 */
@Data
@TableName("ums_resource")
public class UmsResource extends Model<UmsResource> {
	private static final long serialVersionUID = 1L;

	@TableId
	private Long id;
	/**
	 * 创建时间
	 */
	@TableField("create_time")
	private Date createTime;
	/**
	 * 资源名称
	 */
	private String name;
	/**
	 * 资源URL
	 */
	private String url;
	/**
	 * 描述
	 */
	private String description;
	/**
	 * 资源分类ID
	 */
	@TableField("category_id")
	private Long categoryId;

}
