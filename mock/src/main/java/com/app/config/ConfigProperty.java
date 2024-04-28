package com.app.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
@RefreshScope
@Getter
@Setter
@ConfigurationProperties
public class ConfigProperty {


    @Value("${prod.rows}")
    private int prodRows;

}
