package com.github.zhaoxny.yida.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class YidaUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(YidaUserApplication.class, args);
    }

}
