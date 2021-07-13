package com.github.zhaoxny.yida.pms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.zhaoxny.yida.model.dto.resp.PmsProductAttributeCategoryItem;
import com.github.zhaoxny.yida.model.entity.PmsProductAttributeCategory;

import java.util.List;

/**
 * 商品属性分类Service
 *  @Author Henry
 */
public interface PmsProductAttributeCategoryService {
    /**
     * 创建属性分类
     */
    int create(String name);

    /**
     * 修改属性分类
     */
    int update(Long id, String name);

    /**
     * 删除属性分类
     */
    int delete(Long id);

    /**
     * 获取属性分类详情
     */
    PmsProductAttributeCategory getItem(Long id);

    /**
     * 分页查询属性分类
     */
    Page<PmsProductAttributeCategory> getPage(Integer pageSize, Integer pageNum);

    /**
     * 获取包含属性的属性分类
     */
    List<PmsProductAttributeCategoryItem> getListWithAttr();
}
