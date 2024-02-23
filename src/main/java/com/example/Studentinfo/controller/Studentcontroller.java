package com.example.Studentinfo.controller;

import com.example.Studentinfo.model.Student;
import com.example.Studentinfo.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sriindu")
public class Studentcontroller {
    @Autowired
    private Studentservice service;
    @PostMapping("/adddstudent")
    public Student addstudent(@RequestBody Student student){
        return service.createstudent(student);
    }
}
