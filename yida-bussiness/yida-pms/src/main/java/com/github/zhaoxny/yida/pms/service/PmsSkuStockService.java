package com.github.zhaoxny.yida.pms.service;


import com.github.zhaoxny.yida.model.entity.PmsSkuStock;

import java.util.List;

/**
 * sku商品库存管理Service
 * @Author Henry
 */
public interface PmsSkuStockService {
    /**
     * 根据产品id和skuCode模糊搜索
     */
    List<PmsSkuStock> getList(Long pid, String keyword);

    /**
     * 批量更新商品库存信息
     */
    int update(Long pid, List<PmsSkuStock> skuStockList);
}
