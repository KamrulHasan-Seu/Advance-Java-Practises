package com.example.demo.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private StudentDetails studentDetails;

    public Student(String name) {
        this.name = name;
    }
}
