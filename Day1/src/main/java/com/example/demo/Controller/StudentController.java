package com.example.demo.Controller;


import com.example.demo.Entity.StudentEntity;
import com.example.demo.Service.StudentService;
import com.example.demo.StudentDTO.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;


@RestController
public class StudentController {

    @Autowired
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/getStudents")
    public List<StudentDTO> getStudents()
    {
        return service.getStudents();
    }
}
