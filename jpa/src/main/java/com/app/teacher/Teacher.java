package com.app.teacher;

import com.app.course.Course;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


//curl --location --request GET 'http://localhost:8080/teacher/course' \
//--header 'Content-Type: application/json' \
//--header 'Authorization: Basic YWRtaW4tY2xpZW50OnBhc3M=' \
//--data '{
//    "name": "sak1",
//    "age": 12,
//    "dept": "CS",
//    "courses": [
//        {
//            "title": "t2",
//            "abbreviation":"abr",
//            "modules": 12,
//            "fee":123.2
//        }
//    ]
//}'
@Entity
@Table(name = "TEACHER_TBL")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    private String dept;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "TEACHER_COURSE_TABLE",
            joinColumns = {
                    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "course_id", referencedColumnName = "id")
            }
    )
    private Set<Course> courses;

}