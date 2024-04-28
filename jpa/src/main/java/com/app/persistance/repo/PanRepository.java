package com.app.persistance.repo;

import com.app.persistance.entity.PanEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PanRepository extends JpaRepository<PanEnt, Integer> {

}
