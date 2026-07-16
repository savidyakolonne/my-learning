package org.example.properties.abstraction;

public class Son extends Parent{

    public Son(int age){
        super(age);
//        this.age = age;
    }

    @Override
    void career(){
        System.out.println("I want to be a coder");
    }

    @Override
    void partner(){
        System.out.println("I love Someone");
    }
}
