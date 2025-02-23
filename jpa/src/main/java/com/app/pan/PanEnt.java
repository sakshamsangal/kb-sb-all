package com.app.pan;

import com.app.student.StudentEnt;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_pan")
@Getter
@Setter
public class PanEnt {

    @Id
    @Column(name = "roll_num")
    private int rollNum;

    @OneToOne
    @MapsId
    @JoinColumn(name = "roll_num")
    private StudentEnt studentEnt;


    @Column(name = "pan_num")
    private String panNum;

}