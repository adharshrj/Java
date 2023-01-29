package com.javabasics.Static;

public class Human {
    String name;
    int age;
    float salary;
    boolean maritalStatus;

    // static variables belong to the class and not objects of the class
    static long population;

    static void message(){
        System.out.println("Hi User");
        //System.out.println("Hi User + this.name"); cannot use this keyword inside static method
    }
    Human (String name, int age, float salary, boolean maritalStatus) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.maritalStatus = maritalStatus;
        Human.population += 1;
        Human.message();
    }
}
