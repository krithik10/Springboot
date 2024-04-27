package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class StudentController {
    @Autowired
    StudentRepo repo;
    @GetMapping("/students")
    public List<Student> getAllStudents()
    {
        List<Student> students =repo.findAll();
        return students;
    }
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id)
    {
        Student student = repo.findById(id).get();
        return student;
    }
    @PostMapping("/students/add")
    public void createStudent(@RequestBody Student student)
    {
        repo.save(student);
    }
    @PutMapping("/students/update/{id}")
    public void updateStudent(@PathVariable int id)
    {
        Student student = repo.findById(id).get();
        student.setName("Krithik");
        student.setCharity("TVK");
        student.setMethod("offline");
        student.setStatus("successful");
        repo.save(student);
    }
    @DeleteMapping("/students/delete/{id}")
    public void deleteStudent(@PathVariable int id)
    {
        Student student = repo.findById(id).get();
        repo.delete(student);
    }
}