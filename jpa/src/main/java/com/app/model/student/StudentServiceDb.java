package com.app.model.student;

import com.app.model.student.req.StudentApiReq;
import com.app.model.pan.PanEnt;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentServiceDb {

    private final StudentRepository studentRepository;

    public void save(StudentApiReq studentApiReq) {
        StudentEnt studentEnt = getStudent(studentApiReq);
        studentEnt.setPanEnt(getPan(studentApiReq));
        studentRepository.save(studentEnt);
    }

    private StudentEnt getStudent(StudentApiReq studentApiReq) {
        StudentEnt studentEnt = new StudentEnt();
        studentEnt.setFirstName(studentApiReq.getFirstName());
        studentEnt.setLastName(studentApiReq.getFirstName());
        return studentEnt;
    }

    private PanEnt getPan(StudentApiReq studentApiReq) {
        PanEnt panEnt = new PanEnt();
        panEnt.setPanNum(studentApiReq.getPan().getPanNum());
        return panEnt;

    }


}
