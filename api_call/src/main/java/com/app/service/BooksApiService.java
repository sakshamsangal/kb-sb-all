package com.app.service;

import com.app.config.ConfigProperty;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
@RequiredArgsConstructor
public class BooksApiService {

    private final ConfigProperty configProperty;
    private final WebClient webClient;

    public String getBooksApi() {

        // web client call
        return webClient.get()
                .uri(configProperty.getBooksUri())
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
    public String postFileApi() {

        // web client call
        return webClient.post()
                .uri(configProperty.getPostFileUri())
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
