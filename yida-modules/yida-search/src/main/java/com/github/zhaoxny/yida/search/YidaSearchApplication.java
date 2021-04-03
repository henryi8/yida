package com.github.zhaoxny.yida.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@EnableElasticsearchRepositories(basePackages = "com.github.zhaoxny.yida.search.repository")
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class YidaSearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(YidaSearchApplication.class, args);
    }

}
