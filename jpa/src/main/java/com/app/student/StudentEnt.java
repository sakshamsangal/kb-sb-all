package com.app.student;

import com.app.pan.PanEnt;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_student")
@Getter
@Setter
public class StudentEnt {

    @Id
    @Column(name = "roll_num")
    private int rollNum;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;


    @OneToOne(mappedBy = "studentEnt", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private PanEnt panEnt;

}