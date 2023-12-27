package com.app.tracing;

import io.micrometer.observation.annotation.Observed;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentService {

    @Observed(name = "studentService.addStudent")
    public String addStudent() {
        return "hello";
    }
}