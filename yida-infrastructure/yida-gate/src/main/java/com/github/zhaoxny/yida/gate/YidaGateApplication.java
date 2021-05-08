package com.github.zhaoxny.yida.gate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class YidaGateApplication {

    public static void main(String[] args) {
        SpringApplication.run(YidaGateApplication.class, args);
    }

}
