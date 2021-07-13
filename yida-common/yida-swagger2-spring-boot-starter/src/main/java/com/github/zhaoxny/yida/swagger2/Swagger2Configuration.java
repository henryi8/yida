package com.github.zhaoxny.yida.swagger2;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;

/**
 * @Author Henry
 */
@Configuration
@ConditionalOnProperty(name = "yida.swagger.enabled", matchIfMissing = true)
@Import({
        Swagger2DocumentationConfiguration.class
})
public class Swagger2Configuration {
}
