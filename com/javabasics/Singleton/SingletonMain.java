package com.javabasics.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        Singleton obj4 = Singleton.getInstance();
    }
}
