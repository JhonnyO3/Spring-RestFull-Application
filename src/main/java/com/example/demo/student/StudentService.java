package com.example.demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentService {
    private final StudentRepository sr;

    @Autowired
    public StudentService(StudentRepository sr) {
        this.sr = sr;
    }

    public List<Student> getStudents() {
        return sr.findAll();

    }
}
