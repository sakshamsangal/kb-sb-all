package com.app.service;

import com.app.model.StudentApiReq;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentServiceDb studentServiceDb;

    public void saveStud(StudentApiReq studentApiReq) {
        studentServiceDb.save(studentApiReq);
    }
}
