package com.github.zhaoxny.yida.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 * @Author Henry on 2019/4/8.
 */
@Configuration
@MapperScan({"com.github.zhaoxny.yida.*.mapper","ccom.github.zhaoxny.yidadao"})
public class MyBatisConfig {
}
