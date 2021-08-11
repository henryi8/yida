package com.github.zhaoxny.yida.user;

import com.github.zhaoxny.yida.auth.annotation.EnableYdFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 认证授权中心
 *
 * @Author Henry
 */
@EnableYdFeignClients
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(basePackages ={"com.github.zhaoxny.yida.api" })
public class YidaUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(YidaUserApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  用户模块启动成功   ლ(´ڡ`ლ)ﾞ");
    }

}
