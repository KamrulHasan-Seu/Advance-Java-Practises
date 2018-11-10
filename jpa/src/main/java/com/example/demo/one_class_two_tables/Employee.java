package com.example.demo.one_class_two_tables;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@SecondaryTable(name = "Employee_Details")
public class Employee {
    @Id
    @Column(name = "Employee_Id")
    private int id;
    private String name;
    private int age;
    @Column(table = "Employee_Details")
    private String details;

}
