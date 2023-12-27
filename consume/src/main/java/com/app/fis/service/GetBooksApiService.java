package com.app.fis.service;

import com.app.fis.ExtField;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
@RequiredArgsConstructor
public class GetBooksApiService {

    private final ExtField extField;
    private final WebClient webClient;

    public String getBooksApi() {

        // web client call
        return webClient.get()
                .uri(extField.getBooksUri())
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
