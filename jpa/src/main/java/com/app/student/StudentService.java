package com.app.student;
import com.app.pan.PanEnt;

import com.app.pan.PanRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentServiceDb studentServiceDb;
    private final StudentRepository studentRepository;
    private final PanRepository panRepository;

    void getStud() {
        List<StudentEnt> all = studentRepository.findAll();
        System.out.println("all = " + all);

        StudentEnt studentEnt = new StudentEnt();
        studentEnt.setRollNum(103);
        studentEnt.setFirstName("12");
        studentEnt.setLastName("13");

        PanEnt panEnt = new PanEnt();
        panEnt.setStudentEnt(studentEnt);
        panEnt.setPanNum("1222");

        studentEnt.setPanEnt(panEnt);

        // studentRepository.save(studentEnt);
        panRepository.save(panEnt);

        studentRepository.save(studentEnt);
    }

    public void saveStud(StudentApiReq studentApiReq) {
        studentServiceDb.save(studentApiReq);
    }
}
