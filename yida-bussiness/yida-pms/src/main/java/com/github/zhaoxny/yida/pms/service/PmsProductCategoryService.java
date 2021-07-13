package com.github.zhaoxny.yida.pms.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.zhaoxny.yida.ums.dto.req.PmsProductCategoryParam;
import com.github.zhaoxny.yida.model.dto.resp.PmsProductCategoryWithChildrenItem;
import com.github.zhaoxny.yida.model.entity.PmsProductCategory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 商品分类Service
 *  @Author Henry
 */
public interface PmsProductCategoryService {
    /**
     * 创建商品分类
     */
    @Transactional
    int create(PmsProductCategoryParam pmsProductCategoryParam);

    /**
     * 修改商品分类
     */
    @Transactional
    int update(Long id, PmsProductCategoryParam pmsProductCategoryParam);

    /**
     * 分页获取商品分类
     */
    Page<PmsProductCategory> getPage(Long parentId, Integer pageSize, Integer pageNum);

    /**
     * 删除商品分类
     */
    int delete(Long id);

    /**
     * 根据ID获取商品分类
     */
    PmsProductCategory getItem(Long id);

    /**
     * 批量修改导航状态
     */
    int updateNavStatus(List<Long> ids, Integer navStatus);

    /**
     * 批量修改显示状态
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 以层级形式获取商品分类
     */
    List<PmsProductCategoryWithChildrenItem> listWithChildren();
}
