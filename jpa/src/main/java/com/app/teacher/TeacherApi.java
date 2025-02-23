package com.app.teacher;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
@RestController
@RequestMapping("/teacher/course")
@RequiredArgsConstructor
public class TeacherApi {

    private final TeacherRepository teacherRepository;

    private final CourseRepository courseRepository;

    @PostMapping
    public Teacher saveTeacherWithCourse(@RequestBody Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @GetMapping
    public List<Teacher> findALlTeachers() {
        return teacherRepository.findAll();
    }

    @GetMapping("/{teacherId}")
    public Teacher findTeacher(@PathVariable Long teacherId) {
        return teacherRepository.findById(teacherId).orElse(null);
    }

    @GetMapping("/find/{name}")
    public List<Teacher> findTeachersContainingByName(@PathVariable String name) {
        return teacherRepository.findByNameContaining(name);
    }

    @GetMapping("/search/{price}")
    public List<Course> findCourseLessThanPrice(@PathVariable double price) {
        return courseRepository.findByFeeLessThan(price);
    }

}