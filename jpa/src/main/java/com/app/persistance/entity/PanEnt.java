package com.app.persistance.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_pan")
@Data
public class PanEnt {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "pan_num")
    private String panNum;

}