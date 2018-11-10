package com.example.demo.OneToOne;


import com.example.demo.one_class_two_tables.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StuRepository extends JpaRepository<Student,Integer> {
}
