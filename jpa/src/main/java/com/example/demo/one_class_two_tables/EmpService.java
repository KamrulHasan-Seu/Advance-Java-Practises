package com.example.demo.one_class_two_tables;

import org.springframework.stereotype.Service;

@Service
public class EmpService {


    private EmpRepository repo;

    public EmpService(EmpRepository repo) {
        this.repo = repo;
    }

    public Employee save(Employee employee){
        return repo.save(employee);
    }
}

