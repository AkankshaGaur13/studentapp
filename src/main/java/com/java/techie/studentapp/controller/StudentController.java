package com.java.techie.studentapp.controller;

import com.java.techie.studentapp.entity.Student;
import com.java.techie.studentapp.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return service.save(student);
    }

    @GetMapping
    public List<Student> getStudents(){
        return service.findAll();
    }
}
