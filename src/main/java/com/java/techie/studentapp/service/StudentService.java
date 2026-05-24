package com.java.techie.studentapp.service;

import com.java.techie.studentapp.entity.Student;
import com.java.techie.studentapp.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student save(Student student){
        return studentRepository.save(student);

    }

    public List<Student> findAll(){
        return studentRepository.findAll();
    }
}
