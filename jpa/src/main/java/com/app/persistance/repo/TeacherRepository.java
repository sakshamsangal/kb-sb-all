package com.app.persistance.repo;

import com.app.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {

    List<Teacher> findByNameContaining(String name);
}