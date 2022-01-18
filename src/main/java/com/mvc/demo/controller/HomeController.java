package com.mvc.demo.controller;

import com.mvc.demo.model.Student;
import com.mvc.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HomeController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }


    @GetMapping("/inAdd")
    public String inAdd(@ModelAttribute Student student){
        return "form";
    }

    @PostMapping("/form")
    public String add(Model model, @ModelAttribute Student student) {
        System.out.println(student.getStudentName());
        model.addAttribute("student",studentService.add(student));
        return "index";
    }

}
