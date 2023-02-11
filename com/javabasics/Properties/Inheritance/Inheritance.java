package com.javabasics.Properties.Inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.l + " " + box1.w + " " + box1.h);

        Box box2 = new BoxArea(2, 2, 2);
//        System.out.println(box2.area); will not work, parent class cannot access child class object;
        BoxArea box3 = new BoxArea(2, 2, 2);
        System.out.println(box3.area);

    }
}
