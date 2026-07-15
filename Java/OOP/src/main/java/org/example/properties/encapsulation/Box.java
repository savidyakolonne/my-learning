package org.example.properties.encapsulation;

public class Box {
    private double l;
    double h;
    double w;

    Box(double l, double h, double w){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double h, double w){
        this.h = h;
        this.w = w;
    }

    public double getL(){
        return l;
    }
}
