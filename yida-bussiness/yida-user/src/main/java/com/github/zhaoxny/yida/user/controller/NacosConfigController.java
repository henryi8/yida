package com.github.zhaoxny.yida.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosConfigController {

    @Value("${swagger.license}")
    public String env;


    @GetMapping("/nacos-config")
    public String nacosConfig() {

        return env;
    }
}