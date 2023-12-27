package com.app.mock;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class FilePartApiService {
    private final ExtField extField;
    private final FileName fileName;
    @GetMapping("/filePart")
    public ResponseEntity<String> filePart() throws IOException {
        Resource resource;
        if (fileName.fn != null && fileName.fn.equals("0")) {
            resource = extField.getFilePartErr();
        } else {
            resource = extField.getFilePartEmptyArr();
        }
        return ResponseEntity.ok()
                .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .body(resource.getContentAsString(StandardCharsets.UTF_8));
    }

    @GetMapping("/filePart/{status}")
    public ResponseEntity<String> filePartStatus(@PathVariable String status) throws IOException {
        Resource resource;
        if (status.equals("0")) {
            fileName.fn = "0";
            resource = extField.getFilePartErr();
        } else {
            fileName.fn = "1";
            resource = extField.getFilePartEmptyArr();
        }
        return ResponseEntity.ok()
                .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .body(resource.getContentAsString(StandardCharsets.UTF_8));
    }
}
