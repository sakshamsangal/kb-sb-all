package com.app.student;

import com.app.student.req.StudentApiReq;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class StudentApi {

    private final StudentService studentService;

    @PostMapping("/addStudent")
    public ResponseEntity<String> addStudent(@RequestBody StudentApiReq studentApiReq) {
        studentService.saveStud(studentApiReq);
        return ResponseEntity.ok("saved successfully");
    }
}
