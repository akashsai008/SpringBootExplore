package com.example.demo.Service;

import com.example.demo.Entity.StudentEntity;
import com.example.demo.StudentDTO.StudentDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<StudentEntity> getStudents()
    {
        return List.of(new StudentEntity(
                "Akash",
                "saiakashpydipala@gmail.com",
                LocalDate.of(2005,8,1),
                1
        ));
    }
}
