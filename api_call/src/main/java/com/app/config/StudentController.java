package com.app.config;

import com.app.service.BooksApiService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final BooksApiService booksApiService;
    @GetMapping("/")
    public ResponseEntity<Object> getStudent() {
        booksApiService.postFileApi();
        return ResponseEntity.ok("ok");
    }



}
