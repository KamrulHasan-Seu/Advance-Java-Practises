package com.example.demo.one_class_two_tables;


import com.example.demo.one_class_two_tables.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Integer> {
}
