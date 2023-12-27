package com.app.mock;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;

@Configuration
public class MockConfig {

    @Bean
    public FileName fileName() {
        return new FileName();
    }




}
