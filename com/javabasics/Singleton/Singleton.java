package com.javabasics.Singleton;

public class Singleton {
    private int num;
    private Singleton () {
        System.out.println("Singleton");
        incremnet();
    }

    private void incremnet(){
        num += 1;
        System.out.println(num);
    }
    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
