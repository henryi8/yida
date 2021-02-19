package com.github.zhaoxny.yida.admin.service;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.github.zhaoxny.yida.admin.dto.UmsMenuNode;
import com.github.zhaoxny.yida.admin.entity.UmsMenu;

import java.util.List;

/**
 * 后台菜单管理Service
 * @Author Henry
 */
public interface UmsMenuService extends IService<UmsMenu> {
    /**
     * 创建后台菜单
     */
    boolean create(UmsMenu umsMenu);

    /**
     * 修改后台菜单
     */
    boolean update(Long id, UmsMenu umsMenu);

    /**
     * 分页查询后台菜单
     */
    Page<UmsMenu> list(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 树形结构返回所有菜单列表
     */
    List<UmsMenuNode> treeList();

    /**
     * 修改菜单显示状态
     */
    boolean updateHidden(Long id, Integer hidden);
}
