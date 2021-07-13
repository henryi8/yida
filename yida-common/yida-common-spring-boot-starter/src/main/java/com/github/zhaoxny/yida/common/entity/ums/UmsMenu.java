package com.github.zhaoxny.yida.common.entity.ums;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.util.Date;


/**
 * @Description 后台菜单表
 * @Author Henry
 * @Date  2021-07-05 22:53:17
 */
@Data
@TableName("ums_menu")
public class UmsMenu extends Model<UmsMenu> {
	private static final long serialVersionUID = 1L;

	@TableId
	private Long id;
	/**
	 * 父级ID
	 */
	@TableField("parent_id")
	private Long parentId;
	/**
	 * 创建时间
	 */
	@TableField("create_time")
	private Date createTime;
	/**
	 * 菜单名称
	 */
	private String title;
	/**
	 * 菜单级数
	 */
	private Integer level;
	/**
	 * 菜单排序
	 */
	private Integer sort;
	/**
	 * 前端名称
	 */
	private String name;
	/**
	 * 前端图标
	 */
	private String icon;
	/**
	 * 前端隐藏
	 */
	private Integer hidden;

}
