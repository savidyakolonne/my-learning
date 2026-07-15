package org.example.properties.polymorphism;

public class Circle extends Shapes{

    // this will run when obj of circle created
    // hence it is overriding the parent method

    @Override // this is called annotations
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
