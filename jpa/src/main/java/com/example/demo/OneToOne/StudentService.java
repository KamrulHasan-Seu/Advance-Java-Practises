package com.example.demo.OneToOne;

import org.springframework.stereotype.Service;

@Service
public class StudentService {


    private StuRepository stuRepo;

    public StudentService(StuRepository stuRepo) {
        this.stuRepo = stuRepo;
    }

    public Student save(Student student){
        return stuRepo.save(student);
    }
}

