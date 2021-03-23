package com.github.zhaoxny.yida.search.config;

import com.github.zhaoxny.yida.search.swagger.BaseSwaggerConfig;
import com.github.zhaoxny.yida.search.swagger.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * @Author Henry on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.github.zhaoxny.yida.search.controller")
                .title("yida搜索系统")
                .description("yida搜索相关接口文档")
                .contactName("Henry")
                .version("1.0")
                .enableSecurity(false)
                .build();
    }
}
