package org.example.properties.Inheritance;

public class Box {
    double h;
    double l;
    double w;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    Box(double side){

        // super()
        // call the object class

        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }
}
