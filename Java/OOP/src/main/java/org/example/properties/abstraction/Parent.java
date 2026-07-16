package org.example.properties.abstraction;

//public class Parent {
//    abstract void career(String name){}
//}

// want to make the class abstract as well

public abstract class Parent {

    int age;

    public Parent(int age){
        this.age = age;
    }

    static void hello(){
        System.out.println("Hey!!!");
    }

    void normal(){

    }

    // cant make abstract constructors
//    abstract  Parent(){
//
//    }

    abstract void career();
    abstract void partner();

}
