package com.mvc.demo.model;

public class Student {

    private int studentId;
    private String studentName;
    private String branch;
    private String grade;

    public Student() {

    }

    public Student(int studentId, String studentName, String branch, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.branch = branch;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

