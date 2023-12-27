package com.app.fis;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class ExtField {

    @Value("${fis.baseUrl}")
    public String baseUrl;

    @Value("${fis.postFileUri}")
    public String postFileUri;

    @Value("${fis.books}")
    public String booksUri;

}
