package com.javabasics.Static;

public class StaticMain {
    public static void main(String[] args) {
        Human Adharsh = new Human("Adharsh", 23, 30000.56f, false);
        Human Ajith = new Human("Ajith", 19, 0.0f, false);

        // incorrect usage
        System.out.println(Adharsh.population);
        System.out.println(Ajith.population);

        // correct usage
        System.out.println(Human.population);
        Human.message();

        // Non-static method 'message()' cannot be referenced from a static context
        // message() will not work if the method is not static;
        something();

    }

    static void something () {
        //message();
        // Non-static method 'message()' cannot be referenced from a static context
        System.out.println("Static Method");
        StaticMain obj = new StaticMain();
        obj.message();
    }
    void message (){
        // static method 'something()' can be referenced from a non-static context
        //something();
        System.out.println("Non-static Method");
        otherMessage();
    }

    void otherMessage () {
        System.out.println("Non-static other message");
    }
}
