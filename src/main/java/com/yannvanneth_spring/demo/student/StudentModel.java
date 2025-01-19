package com.yannvanneth_spring.demo.student;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity(name = "Students")
@Setter
@Getter
public class StudentModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "DateOfBirth")
    private LocalDate DateOfBirth;

    @Column(name = "email")
    private String email;

    public StudentModel(){}

    public StudentModel(String name, LocalDate dateOfBirth, String email) {
        this.name = name;
        this.DateOfBirth = dateOfBirth;
        this.email = email;
    }


}
