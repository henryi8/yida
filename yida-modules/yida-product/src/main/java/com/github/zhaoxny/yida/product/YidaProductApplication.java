package com.github.zhaoxny.yida.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableEurekaClient
@EnableWebMvc
@SpringBootApplication
@EnableDiscoveryClient
public class YidaProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(YidaProductApplication.class, args);
    }

}


