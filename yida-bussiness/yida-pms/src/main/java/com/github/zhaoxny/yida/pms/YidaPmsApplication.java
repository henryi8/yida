package com.github.zhaoxny.yida.pms;


@EnableEurekaClient
@EnableWebMvc
@SpringBootApplication
@EnableDiscoveryClient
public class YidaPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(YidaPmsApplication.class, args);
    }

}


