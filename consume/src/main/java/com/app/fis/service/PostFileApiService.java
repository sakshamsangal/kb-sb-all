package com.app.fis.service;

import com.app.fis.ExtField;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
@RequiredArgsConstructor
public class PostFileApiService {

    private final ExtField extField;
    private final WebClient webClient;

    public String postFileApi() {

        // form query param

        // web client call
        return webClient.post()
                .uri(extField.getPostFileUri())
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
