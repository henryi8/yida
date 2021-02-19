package com.github.zhaoxny.yida.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.github.zhaoxny.yida.admin.entity.UmsResourceCategory;

import java.util.List;

/**
 * 后台资源分类管理Service
 *
 * @Author Henry
 */
public interface UmsResourceCategoryService extends IService<UmsResourceCategory> {

    /**
     * 获取所有资源分类
     */
    List<UmsResourceCategory> listAll();

    /**
     * 创建资源分类
     */
    boolean create(UmsResourceCategory umsResourceCategory);
}
