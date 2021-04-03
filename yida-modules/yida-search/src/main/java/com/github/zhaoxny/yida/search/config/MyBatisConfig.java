package com.github.zhaoxny.yida.search.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 * @Author Henry on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.github.zhaoxny.yida.search.*"})
public class MyBatisConfig {
}
