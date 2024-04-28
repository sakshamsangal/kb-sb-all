package com.app.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;
@Service
@Slf4j
@RequiredArgsConstructor
public class WeatherService {

    private final RestTemplate restTemplate;

    public void conPost() {
        log.info("conPost");

        // set headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.add("Authorization", "Bearer 623c0324-4395-3769-a8b9-49d3c8be91e9");

        // set the payload
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("title", "john");
        map.add("body", "body test");

        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(map, headers);
        log.info(String.valueOf(entity));

        String catEndpoint = "https://jsonplaceholder.typicode.com/posts";

        try {
            ResponseEntity<String> response = restTemplate.exchange(catEndpoint, HttpMethod.POST, entity, String.class);
            log.info(String.valueOf(response));
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
        }
    }

    public void conGet() {
        log.info("conGet");
        // set headers
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.add("Authorization", "Bearer 623c0324-4395-3769-a8b9-49d3c8be91e9");


        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(headers);
        log.info(String.valueOf(entity));

        String catEndpoint = "https://jsonplaceholder.typicode.com/posts/2";

        ResponseEntity<String> response = restTemplate.exchange(catEndpoint, HttpMethod.GET, entity, String.class);
        log.info(String.valueOf(response));
    }





}