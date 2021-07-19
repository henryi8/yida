package com.github.zhaoxny.yida.redis.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @Author Henry
 */
@Setter
@Getter
@ConfigurationProperties(prefix = "yida.cache-manager")
public class CacheManagerProperties {
    private List<CacheConfig> configs;

    @Setter
    @Getter
    public static class CacheConfig {
        /**
         * cache key
         */
        private String key;
        /**
         * 过期时间，sec
         */
        private long second = 60;
    }
}
