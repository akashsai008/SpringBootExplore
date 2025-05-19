package com.example.ProjectK.Service;


import com.example.ProjectK.DTO.StudentDTO;
import com.example.ProjectK.Entity.StudentEntity;
import com.example.ProjectK.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public StudentDTO saveStudent(StudentDTO studentDTO) {
        StudentEntity student = new StudentEntity();
        student.setName(studentDTO.getName());
        student.setAge(studentDTO.getAge());
        student.setEmail(studentDTO.getEmail());

        StudentEntity savedStudent = repository.save(student);

        StudentDTO responseDTO = new StudentDTO();
        responseDTO.setName(savedStudent.getName());
        responseDTO.setAge(savedStudent.getAge());
        responseDTO.setEmail(savedStudent.getEmail());

        return responseDTO;
    }

    public StudentDTO getStudentById(Integer id) {
        StudentEntity entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        StudentDTO dto = new StudentDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setAge(entity.getAge());
        dto.setEmail(entity.getEmail());

        return dto;
    }


}
