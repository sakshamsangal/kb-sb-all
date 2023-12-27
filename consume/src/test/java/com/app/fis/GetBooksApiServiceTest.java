package com.app.fis;

import com.app.fis.service.GetBooksApiService;
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
class GetBooksApiServiceTest {
    private final MockWebServer mockWebServer = new MockWebServer();
    @Mock
    private ExtField pageroExtField;
    @InjectMocks
    private GetBooksApiService apiCaller;


    @BeforeEach
    void setUp() {
        apiCaller =  new GetBooksApiService(pageroExtField, WebClient.create(mockWebServer.url("/").toString()));
    }

    @AfterEach
    void tearDown() throws IOException {
        mockWebServer.shutdown();
    }

    @Test
    void getBooks() {
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