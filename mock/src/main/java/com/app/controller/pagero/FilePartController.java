package com.app.controller.pagero;

import com.app.util.AppUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class FilePartController {
    @Value("classpath:api/res/pagero/filePartErr.json")
    private Resource filePartErr;

    /**
     * See <a href="http://localhost:8080/v1/documents">http://localhost:8080/v1/documents</a>
     */
    @GetMapping("/v1/documents")
    public ResponseEntity<String> filePart() throws IOException {
        return AppUtil.getStringResponseEntity(filePartErr);
    }

}
