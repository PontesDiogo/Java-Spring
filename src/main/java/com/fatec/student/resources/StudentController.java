package com.fatec.student.resources;

import org.springframework.web.bind.annotation.RestController;

import com.fatec.student.entities.Student;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("students")

public class StudentController {

    @GetMapping
    public List<Student> getStudents(){

        Student s1 = new Student();
        //variavel --- obejto

        s1.setId(1);
        s1.setName("Diogo");
        s1.setCourse("ADS");
        Student s2 = new Student();
        //variavel --- obejto

        s2.setId(2);
        s2.setName("Igor");
        s2.setCourse("ADS");

        Student s3 = new Student();
        //variavel --- obejto

        s3.setId(3);
        s3.setName("José");
        s3.setCourse("ADS");

        ArrayList<Student> lista = new ArrayList<>();
        lista.add(s1);
        lista.add(s2);
        lista.add(s3);
        return lista;
    }
    
}
