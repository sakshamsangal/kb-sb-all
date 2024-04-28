package com.app.mock;

import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class AppUtil {
    public static ResponseEntity<String> getStringResponseEntity(Resource resource) throws IOException {
        return ResponseEntity.ok()
                .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .body(resource.getContentAsString(StandardCharsets.UTF_8));
    }
}
