package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
    @Autowired
    StudentRepo pr;
    public Student createperson(Student p)
    {
        return pr.save(p);
    }
}
