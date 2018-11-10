package com.example.demo.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class StudentDetails {
    @Id
    private int id;
    private double gpa;
    private String role;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Student student;
}
