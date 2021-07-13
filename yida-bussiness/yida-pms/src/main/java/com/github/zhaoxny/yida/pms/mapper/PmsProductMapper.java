package com.github.zhaoxny.yida.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.zhaoxny.yida.model.dto.example.PmsProductExample;
import com.github.zhaoxny.yida.model.dto.resp.PmsProductResult;
import com.github.zhaoxny.yida.model.entity.PmsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductMapper extends BaseMapper<PmsProduct> {
    long countByExample(PmsProductExample example);

    int deleteByExample(PmsProductExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProduct record);

    int insertSelective(PmsProduct record);

    List<PmsProduct> selectByExampleWithBLOBs(PmsProductExample example);

    List<PmsProduct> selectByExample(PmsProductExample example);

    PmsProduct selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProduct record, @Param("example") PmsProductExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsProduct record, @Param("example") PmsProductExample example);

    int updateByExample(@Param("record") PmsProduct record, @Param("example") PmsProductExample example);

    int updateByPrimaryKeySelective(PmsProduct record);

    int updateByPrimaryKeyWithBLOBs(PmsProduct record);

    int updateByPrimaryKey(PmsProduct record);

    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}