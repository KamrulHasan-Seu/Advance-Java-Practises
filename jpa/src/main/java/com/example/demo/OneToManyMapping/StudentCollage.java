package com.example.demo.OneToManyMapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class StudentCollage {
    @Id
    private int stuId;
    private String stuName;
    @ManyToOne
    @JoinColumn(name = "col_Id")
    private Collage collage;
}
