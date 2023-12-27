package com.app.mock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public MyFile fileName() {
        return new MyFile();
    }




}
