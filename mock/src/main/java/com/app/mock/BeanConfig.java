package com.app.mock;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "db")
@RefreshScope
public class BeanConfig {

    @Bean
    public ResType fileName() {
        return new ResType();
    }




}
