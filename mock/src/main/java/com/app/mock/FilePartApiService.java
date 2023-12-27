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
@RequestMapping("/v1/filePart")
public class FilePartApiService {

    private final ExtField extField;
    private final MyFile myFile;
    @GetMapping
    public ResponseEntity<String> filePart() throws IOException {
        Resource resource;
        if (myFile.getFileName() != null && myFile.getFileName().equals("0")) {
            resource = extField.getFilePartErr();
        } else {
            resource = extField.getFilePartEmptyArr();
        }
        return ResponseEntity.ok()
                .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .body(resource.getContentAsString(StandardCharsets.UTF_8));
    }

    @GetMapping("/{status}")
    public ResponseEntity<String> filePartStatus(@PathVariable String status) throws IOException {
        Resource resource;
        if (status.equals("0")) {
            myFile.setFileName("0");
            resource = extField.getFilePartErr();
        } else {
            myFile.setFileName("1");
            resource = extField.getFilePartEmptyArr();
        }
        return ResponseEntity.ok()
                .header("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                .body(resource.getContentAsString(StandardCharsets.UTF_8));
    }
}
