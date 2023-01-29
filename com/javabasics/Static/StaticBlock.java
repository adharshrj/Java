package com.javabasics.Static;

public class StaticBlock {
    static int a = 23;
    static int b;

    // only executed one time. Executed when the class is loaded
    static {
        System.out.println("Static Block");
        b = a * 24;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println("a = " + a + " b = " + b);

        b += 24;
        System.out.println("a = " + a + " b = " + b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println("a = " + a + " b = " + b);
    }
}
