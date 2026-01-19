package com.example.day2part2.controller;

import com.example.day2part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Home {
    @GetMapping("/")
    public List<StudentModel> getStudent() {
        List<StudentModel> list = new ArrayList<>();
        list.add(new StudentModel(1,"Aditya","aditya1040@zohomail.in"));
        list.add(new StudentModel(2,"Abhishek","abhishek@zohomail.in"));
        list.add(new StudentModel(3,"Ajay","ajay@zohomail.in"));
        list.add(new StudentModel(4,"Agrim","agrim@zohomail.in"));
        list.add(new StudentModel(5,"Aditya","aditya@zohomail.in"));
        return list;
    }
}
