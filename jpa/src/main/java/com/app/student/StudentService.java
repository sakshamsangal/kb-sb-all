package com.app.student;

import com.app.student.req.StudentApiReq;
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
