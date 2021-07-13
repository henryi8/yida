package com.github.zhaoxny.yida.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.zhaoxny.yida.model.dto.resp.PmsProductAttrInfo;
import com.github.zhaoxny.yida.model.entity.PmsProductAttribute;
import com.github.zhaoxny.yida.model.dto.example.PmsProductAttributeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductAttributeMapper extends BaseMapper<PmsProductAttribute> {
    long countByExample(PmsProductAttributeExample example);

    int deleteByExample(PmsProductAttributeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductAttribute record);

    int insertSelective(PmsProductAttribute record);

    List<PmsProductAttribute> selectByExample(PmsProductAttributeExample example);

    PmsProductAttribute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductAttribute record, @Param("example") PmsProductAttributeExample example);

    int updateByExample(@Param("record") PmsProductAttribute record, @Param("example") PmsProductAttributeExample example);

    int updateByPrimaryKeySelective(PmsProductAttribute record);

    int updateByPrimaryKey(PmsProductAttribute record);
    /**
     * 获取商品属性信息
     */
    List<PmsProductAttrInfo> getProductAttrInfo(@Param("id") Long productCategoryId);
}