package com.app.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@Getter
@Setter
public class ExtProperty {


    @Value("${prod.rows}")
    private int prodRows;

}
