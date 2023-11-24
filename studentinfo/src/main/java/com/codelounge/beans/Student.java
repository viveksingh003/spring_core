package com.codelounge.beans;

public class Student {

    private int id;
    private int contactNo;
    private String addr;
    private float marks;

    public void setId(int id) {
        this.id = id;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public Student(int contactNo) {
        this.contactNo = contactNo;
    }


    public String toString() {
        return "Student Details " + id + " " + marks + " " + contactNo + " " + addr;

    }
}
