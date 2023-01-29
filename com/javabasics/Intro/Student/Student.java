package com.javabasics.Intro.Student;

public class Student {
    public String name;
    public float marks;
    public int rollno;

    public Student (String name, float marks, int rollno){
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    public void greeting () {
        System.out.println("Good Day, I am" + " " +  name);
    }

    public Student () {

    }

    public Student (Student input) {
        this.name = input.name;
        this.marks = input.marks;
        this.rollno = input.rollno;
    }
}

