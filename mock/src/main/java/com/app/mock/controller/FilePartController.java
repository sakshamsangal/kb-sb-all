package com.app.mock.controller;

import com.app.mock.AppUtil;
import com.app.mock.ExtField;
import com.app.mock.ResType;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
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
public class FilePartController {
    private final ExtField extField;
    private final ResType resType;

    @GetMapping("/{type}")
    public ResponseEntity<String> filePartStatus(@PathVariable String type) throws IOException {
        resType.setType(type);
        return ResponseEntity.ok().body("Success");
    }

    @GetMapping
    public ResponseEntity<String> filePart() throws IOException {
        Resource resource;
        if (StringUtils.equals("0", resType.getType())) {
            resource = extField.getFilePartErr();
        } else {
            resource = extField.getFilePartEmptyArr();
        }
        return AppUtil.getStringResponseEntity(resource);
    }

}
