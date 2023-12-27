package com.app.teacher;

import com.app.course.Course;
import com.app.course.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher/course")
@RequiredArgsConstructor
public class TeacherCourseController {

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