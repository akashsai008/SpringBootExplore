package com.example.ProjectK.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

    private Integer id;
    private String name;
    private Integer age;
    private String email;

}
