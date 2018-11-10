package com.example.demo.OneToManyMapping;

import com.example.demo.OneToOne.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Collage {
    @Id
    private int colId;
    private String colName;
    @OneToMany(targetEntity = StudentCollage.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<StudentCollage> student;
}
