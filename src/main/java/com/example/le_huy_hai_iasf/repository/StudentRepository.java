package com.example.le_huy_hai_iasf.repository;


import com.example.le_huy_hai_iasf.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    List<StudentEntity> findAllByFullName(String fullName);
    StudentEntity findStudentEntityByEmail(String email);
}
