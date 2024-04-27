package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name  = "DF_FUNDS")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    @Column(name = "Name")
    String name;
    @Column(name = "Charity")
    String charity;
    @Column(name = "Method")
    String method;
    @Column(name = "Status")
    String status;
    public Student() {
    }
    public Student(int id, String name, String charity, String method, String status) {
        this.id = id;
        this.name = name;
        this.charity = charity;
        this.method = method;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCharity() {
        return charity;
    }
    public void setCharity(String charity) {
        this.charity = charity;
    }
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}
