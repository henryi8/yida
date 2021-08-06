package com.github.zhaoxny.yida.ums.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NacosConfigController {

    @Value("${swagger.license}")
    public String env;
    @Value("${share.config1}")
    public String config1;


    @GetMapping("/nacos-config")
    public String nacosConfig() {

        return env+config1;
    }
}