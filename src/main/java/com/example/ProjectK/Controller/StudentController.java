package com.example.ProjectK.Controller;


import com.example.ProjectK.DTO.StudentDTO;
import com.example.ProjectK.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/{id}")
    public StudentDTO returnStudent(@PathVariable Integer id) {
        return service.getStudentById(id);
    }

    @PostMapping
    public StudentDTO createUser(@RequestBody StudentDTO dto) {
        return service.saveStudent(dto);
    }
}
