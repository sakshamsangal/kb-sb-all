package com.app.fis;

import com.app.config.ConfigProperty;
import com.app.service.BooksApiService;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;


@ExtendWith({MockitoExtension.class})
class BooksApiServiceTest {
    private final MockWebServer mockWebServer = new MockWebServer();
    @Mock
    private ConfigProperty pageroConfigProperty;
    @InjectMocks
    private BooksApiService apiCaller;


    @BeforeEach
    void setUp() {
        apiCaller =  new BooksApiService(pageroConfigProperty, WebClient.create(mockWebServer.url("/").toString()));
    }

    @AfterEach
    void tearDown() throws IOException {
        mockWebServer.shutdown();
    }

    @Test
    void postFileApi() {
        mockWebServer.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                        .setBody("{\"id\": \"value for y\", \"lastName\": 789}")
        );
        String s = apiCaller.postFileApi();
        System.out.println("s = " + s);

    }

    @Test
    void getBooksApi() {
        mockWebServer.enqueue(
                new MockResponse()
                        .setResponseCode(200)
                        .setHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                        .setBody("{\"id\": \"value for y\", \"lastName\": 789}")
        );
        String s = apiCaller.getBooksApi();
        System.out.println("s = " + s);

    }
}