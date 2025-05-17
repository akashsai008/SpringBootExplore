package com.example.demo.StudentDTO;

import lombok.*;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO {

    private String name;
    private String email;
    private LocalDate dob;
    private Integer id;
}
