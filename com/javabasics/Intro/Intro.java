package com.javabasics.Intro;

import com.javabasics.Intro.Student.Student;

public class Intro {
    public static void main(String[] args) {
        Student Adharsh = new Student("Adharsh RJ", 100.0f, 51);
        Student Mad = new Student();

        System.out.println("Adharsh" + " " + Adharsh.name + " " + "Mad" + " " + Mad.name);
        Adharsh.greeting();

        Student Adh2 = new Student(Adharsh);
        System.out.println(Adh2.name);

        final String names = "Something";
        // names = "pt"; cannot reassign
        System.out.println(names);

        final Student Mad2 = new Student();
        // Mad2 = new Student(Adharsh) is not possible because of final keyword;
        Mad2.name = "Changed to " + Adharsh.name;
        // Can change attributes of the instance
        System.out.println(Mad2.name);

        Test obj = new Test("no");

        for (int i = 0; i < 1000000000; i++) {
            obj = new Test("New Object");
        }

        System.out.println(obj);
        
    }
}


class Test {
    String name;

    public Test (String name) {
        // System.out.println("Object Created");
        this.name = name;
    }

     // Task to do while garbage collection
     @Override
     protected void finalize() throws Throwable {
         System.out.println("Object Destoryed , Memory Cleared");
     }
}