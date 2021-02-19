package com.github.zhaoxny.yida.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.zhaoxny.yida.admin.entity.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 后台用户角色表 Mapper 接口
 * </p>
 *
 * @Author Henry
 * @Date 2020-08-21
 */
public interface UmsRoleMapper extends BaseMapper<UmsRole> {

    /**
     * 获取用户所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

}
