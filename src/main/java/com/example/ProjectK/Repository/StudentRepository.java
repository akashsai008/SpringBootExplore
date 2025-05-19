package com.example.ProjectK.Repository;

import com.example.ProjectK.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {

}
