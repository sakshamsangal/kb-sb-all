package com.app.model.mock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MockConfig {

    @Bean
    public FileName fileName() {
        return new FileName();
    }
}
