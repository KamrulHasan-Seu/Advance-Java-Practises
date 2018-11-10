package com.example.demo.OneToManyMapping;

import com.example.demo.OneToOne.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCollageRepository extends JpaRepository<StudentCollage,Integer> {
}
