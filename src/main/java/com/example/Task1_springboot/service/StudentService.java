package com.example.Task1_springboot.service;

import com.example.Task1_springboot.model.Student;
import com.example.Task1_springboot.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public List<Student> getAll(){
        return studentRepository.findAll();
    }


    public Student getById(long id){
        return studentRepository.findById(id).orElse(null);
    }


    public Student create(Student student){
        return studentRepository.save(student);
    }


    public Student update(Student student){
        return studentRepository.save(student);
    }

    public void delete(Long id){
        studentRepository.deleteById(id);
    }

}

