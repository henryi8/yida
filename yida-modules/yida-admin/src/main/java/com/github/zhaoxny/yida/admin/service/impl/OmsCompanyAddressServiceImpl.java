package com.github.zhaoxny.yida.admin.service.impl;

import com.github.zhaoxny.yida.admin.service.OmsCompanyAddressService;
import com.github.zhaoxny.yida.model.dto.example.OmsCompanyAddressExample;
import com.github.zhaoxny.yida.model.mapper.OmsCompanyAddressMapper;
import com.github.zhaoxny.yida.model.entity.OmsCompanyAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址管理Service实现类
 * @Author Henry
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;
    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
