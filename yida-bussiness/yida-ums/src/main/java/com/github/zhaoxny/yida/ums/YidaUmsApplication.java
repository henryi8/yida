package com.github.zhaoxny.yida.ums;

import com.github.zhaoxny.yida.auth.annotation.EnableCustomConfig;
import com.github.zhaoxny.yida.auth.annotation.EnableRyFeignClients;
import com.github.zhaoxny.yida.swagger2.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class YidaUmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(YidaUmsApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ");
    }

}
