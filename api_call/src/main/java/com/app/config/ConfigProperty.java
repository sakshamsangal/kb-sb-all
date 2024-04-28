package com.app.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ConfigProperty {

    @Value("${fis.baseUrl}")
    public String baseUrl;

    @Value("${fis.postFileUri}")
    public String postFileUri;

    @Value("${fis.books}")
    public String booksUri;

}
