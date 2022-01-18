package com.mvc.demo.service;

import com.mvc.demo.model.Student;
import com.mvc.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public void getAll(){
        studentRepo.getAll();
    }

    public List<Student> listStudent(){
        return studentRepo.listStudent();
    }

    public List<Student> add(Student stu){
         return studentRepo.add(stu);
    }

    public void delete(int id){
        studentRepo.delete(id);
    }

    public void edit(Student stu){
        studentRepo.edit(stu);
    }
}
