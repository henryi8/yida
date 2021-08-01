package com.github.zhaoxny.yida.user;


//import com.github.zhaoxny.yida.auth.annotation.EnableCustomConfig;
//import com.github.zhaoxny.yida.auth.annotation.EnableRyFeignClients;
//import com.github.zhaoxny.yida.swagger2.annotation.EnableCustomSwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableCustomConfig
//@EnableCustomSwagger2
//@EnableRyFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class YidaUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(YidaUserApplication.class, args);
    }

}
