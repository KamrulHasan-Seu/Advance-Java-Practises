package com.example.demo;

import com.example.demo.OneToManyMapping.Collage;
import com.example.demo.OneToManyMapping.CollageService;
import com.example.demo.OneToManyMapping.StudentCollageService;
import com.example.demo.OneToManyMapping.StudentCollage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        //EmpService empService = run.getBean(EmpService.class);
        //StudentService stuService = run.getBean(StudentService.class);
        StudentCollageService studentCollageService = run.getBean(StudentCollageService.class);
        CollageService collageService = run.getBean(CollageService.class);

        //One_Class_two_tables
//        Employee employee =new Employee();
//        employee.setId(1);
//        employee.setName("Kamrul");
//        employee.setAge(23);
//        employee.setDetails("Student");
        //EmpService service = new EmpService();
//       empService.save(employee);

        //ONE_To_One Mapping
//        Student student = new Student("Shamim");
//        StudentDetails studentDetails = new StudentDetails(101, 3.55, "CR", student);
//        student.setStudentDetails(studentDetails);
//
//        student.setStudentDetails(studentDetails);
//        stuService.save(student);

        //OneToMany Mapping
        List<StudentCollage> studentList = new ArrayList<>();



        Collage collage = new Collage(1001,"Southeast University",studentList);
        StudentCollage studentCollage  = new StudentCollage(1,"Kamrul",collage);
        StudentCollage studentCollage1  = new StudentCollage(2,"Shamim",collage);
        studentList.add(studentCollage);
        studentList.add(studentCollage1);

        collageService.save(collage);
        studentCollageService.save(studentCollage);
        studentCollageService.save(studentCollage1);

    }
}
