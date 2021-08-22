package com.github.zhaoxny.yida.gen;

import com.github.zhaoxny.yida.auth.annotation.EnableCustomConfig;
import com.github.zhaoxny.yida.auth.annotation.EnableYdFeignClients;
import com.github.zhaoxny.yida.swagger2.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 代码生成
 *
 * @Author Henry
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableYdFeignClients
@SpringBootApplication
public class YidaGenApplication {
    public static void main(String[] args) {
        SpringApplication.run(YidaGenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  代码生成模块启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
