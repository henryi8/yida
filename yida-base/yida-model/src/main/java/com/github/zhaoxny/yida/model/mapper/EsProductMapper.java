package com.github.zhaoxny.yida.model.mapper;

import com.github.zhaoxny.yida.model.domain.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 搜索商品管理自定义Dao
 *
 * @Author Henry
 */
public interface EsProductMapper {
    /**
     * 获取指定ID的搜索商品
     */
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
