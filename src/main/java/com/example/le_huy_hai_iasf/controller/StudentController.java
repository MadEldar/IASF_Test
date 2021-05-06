package com.example.le_huy_hai_iasf.controller;

import com.example.le_huy_hai_iasf.entity.StudentEntity;
import com.example.le_huy_hai_iasf.formEntity.LoginForm;
import com.example.le_huy_hai_iasf.formEntity.StudentForm;
import com.example.le_huy_hai_iasf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Calendar;
import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping({"/home"})
    public String index(Model model) {
        seedData();
        List<StudentEntity> students = studentService.findAllStudent();
        model.addAttribute("students", students);
        return "index";
    }

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/")
    public String loginPost(Model model, @Valid LoginForm loginForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "login";
        }

        StudentEntity studentEntity = studentService.findByEmail(loginForm.getEmail());

        if (studentEntity != null && studentEntity.getPassword().equals(loginForm.getPassword())) {
            return "redirect:/home";
        }

        return "login";
    }

    @GetMapping({"/create"})
    public String create() {
        return "create";
    }

    @PostMapping({"/create"})
    public String createPost(@Valid StudentForm studentForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors() || studentForm.getPassword() != studentForm.getConfirmPassword()) {
            return "create";
        }

        studentService.createStudent(new StudentEntity(studentForm));

        return "redirect:/home";
    }

    private void seedData() {
        if (studentService.getStudentCount() == 0) {
            Calendar dob = Calendar.getInstance();
            dob.set(1998, Calendar.JANUARY, 6);
            studentService.createStudent(new StudentEntity("Le Huy Hai", "haile123", "Male", "haile123@gmail.com", "0935215634", dob.getTime(), "Hanoi"));
        }
    }
}
