package com.mvc.demo.repository;

import com.mvc.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private List<Student> list = new ArrayList<>();

    public void getAll(){
        for(Student stu:list){
            list.add(stu);
        }
    }

    public List<Student> listStudent(){
        return list;
    }

    public List<Student> add(Student stu){
        Student obj = new Student();
        obj.setStudentId(stu.getStudentId());
        obj.setStudentName(stu.getStudentName());
        obj.setBranch(stu.getBranch());
        obj.setGrade(stu.getGrade());
        list.add(obj);
        return list;
    }

    public void delete(Integer id){
            list.removeIf(x->x.getStudentId()==(id));
    }

    public void edit(Student stu){
        int idx =0; int id =0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).getStudentId() == stu.getStudentId()){
                id = stu.getStudentId();
                idx=i;
                break;
            }
        }
        Student obj = new Student();
        obj.setStudentId(id);
        obj.setStudentName(stu.getStudentName());
        obj.setBranch(stu.getBranch());
        obj.setGrade(stu.getGrade());
        list.set(idx,obj);
    }
}
