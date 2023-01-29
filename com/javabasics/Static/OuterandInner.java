package com.javabasics.Static;

public class OuterandInner {

    // since Inner class depends on OuterandInner class, it needs to be static
    static class Inner {
        String name;

        public Inner(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Inner A = new Inner("Adharsh");

    }
}

// wont work, outer classes cannot be static
//static class outer {
//
//}