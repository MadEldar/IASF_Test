package com.example.le_huy_hai_iasf.service;

import com.example.le_huy_hai_iasf.entity.StudentEntity;
import com.example.le_huy_hai_iasf.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public StudentEntity createStudent(StudentEntity studentEntity) {
        return studentRepository.save(studentEntity);
    }

    @Override
    public StudentEntity findById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public StudentEntity findByEmail(String email) {
        return studentRepository.findStudentEntityByEmail(email);
    }

    @Override
    public List<StudentEntity> findByFullName(String fullName) {
        return studentRepository.findAllByFullName(fullName);
    }

    @Override
    public List<StudentEntity> findAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public long getStudentCount() {
        return studentRepository.count();
    }
}
