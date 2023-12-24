package com.app.model.fis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Slf4j
@Service
public class FisService {

    /**
     * api: post
     * sec: oauth2
     * body: form-data
     *
     */

    private void conGet() {
        log.info("conGet");
        String milkEndpoint = "https://jsonplaceholder.typicode.com/posts/2";

        WebClient webClient = WebClient.create();
        String str = webClient.get()
                .uri(milkEndpoint)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        log.info(str);
    }
}
