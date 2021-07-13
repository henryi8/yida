package com.github.zhaoxny.yida.common.entity.ums;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;


/**
 * @Description 资源分类表
 * @Author Henry
 * @Date  2021-07-05 22:53:17
 */
@Data
@TableName("ums_resource_category")
public class UmsResourceCategory extends Model<UmsResourceCategory> {
	private static final long serialVersionUID = 1L;

	@TableId
	private Long id;
	/**
	 * 创建时间
	 */
	@TableField("create_time")
	private Date createTime;
	/**
	 * 分类名称
	 */
	private String name;
	/**
	 * 排序
	 */
	private Integer sort;

}
