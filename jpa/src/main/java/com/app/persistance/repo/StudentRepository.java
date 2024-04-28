package com.app.persistance.repo;

import com.app.persistance.entity.StudentEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEnt, Integer> {

}
