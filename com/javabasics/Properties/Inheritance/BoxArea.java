package com.javabasics.Properties.Inheritance;

public class BoxArea extends Box{
    double area;

    public BoxArea () {
        this.area = -1;
    }

    public BoxArea(double l, double w, double h){
        super(l, w, h);
        this.area = l * w * h;
    }
}
