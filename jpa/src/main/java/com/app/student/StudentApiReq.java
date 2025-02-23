package com.app.student;

import com.app.pan.Pan;
import lombok.*;

@Getter
@Setter
public class StudentApiReq {
    private String firstName;
    private String lastName;
    private Pan pan;
}
