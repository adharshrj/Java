package com.javabasics.Properties.Inheritance;

public class Box {
    double h;
    double w;
    double l;

    Box () {
        // super() Object class
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    Box (Box oldBox) {
        this.h = oldBox.h;
        this.w = oldBox.w;
        this.l = oldBox.l;
    }

    Box (double l,double w,double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
}
