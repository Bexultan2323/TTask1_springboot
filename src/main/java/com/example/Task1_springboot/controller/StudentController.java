package com.example.Task1_springboot.controller;

import com.example.Task1_springboot.model.Student;
import com.example.Task1_springboot.repository.StudentRepository;
import com.example.Task1_springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/api/students/{studentId}")
    public ResponseEntity<?> getStudents(@PathVariable Long studentId) {
        return ResponseEntity.ok(studentService.getById(studentId));
    }

    @GetMapping("/api/students")
    public ResponseEntity<?> getStudents() {
        return ResponseEntity.ok(studentService.getAll());
    }

    @PostMapping("/api/students")
    public ResponseEntity<?> saveStudents(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.create(student));
    }

}
