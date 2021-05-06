package com.example.le_huy_hai_iasf.service;

import com.example.le_huy_hai_iasf.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    StudentEntity createStudent(StudentEntity studentEntity);
    StudentEntity findById(int id);
    StudentEntity findByEmail(String email);
    List<StudentEntity> findByFullName(String fullName);
    List<StudentEntity> findAllStudent();
    long getStudentCount();
}
