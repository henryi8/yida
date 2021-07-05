package com.github.zhaoxny.yida.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.github.zhaoxny.yida.generator.dao")
public class YidaGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(YidaGeneratorApplication.class, args);
    }

}
