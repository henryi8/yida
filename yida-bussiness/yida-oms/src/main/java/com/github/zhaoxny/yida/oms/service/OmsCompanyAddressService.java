package com.github.zhaoxny.yida.oms.service;

import com.github.zhaoxny.yida.model.entity.OmsCompanyAddress;

import java.util.List;

/**
 * 收货地址管Service
 * @Author Henry
 */
public interface OmsCompanyAddressService {
    /**
     * 获取全部收货地址
     */
    List<OmsCompanyAddress> list();
}
