package com.app.model.student;

import com.app.model.pan.PanEnt;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_student")
@Data
public class StudentEnt {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne(cascade=CascadeType.ALL)
    private PanEnt panEnt;

}