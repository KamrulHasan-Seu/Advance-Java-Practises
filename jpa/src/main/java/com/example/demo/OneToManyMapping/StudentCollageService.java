package com.example.demo.OneToManyMapping;

import org.springframework.stereotype.Service;

@Service
public class StudentCollageService {
    private StudentCollageRepository studentCollageRepository;

    public StudentCollageService(StudentCollageRepository studentCollageRepository) {
        this.studentCollageRepository = studentCollageRepository;
    }

    public StudentCollage save(StudentCollage studentCollage){
        return studentCollageRepository.save(studentCollage);
   }
}
