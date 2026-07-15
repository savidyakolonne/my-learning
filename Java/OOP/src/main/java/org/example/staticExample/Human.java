package org.example.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
//    long population;    ------>  not updating to 2

// updating to
//    2
//    2

    static long population;

    static void message(){
        System.out.println("Hello World");

//        System.out.println(this.age);
//        cant use this over here -> (this in the object)
    }

    public Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

//        this.population += 1 ;
        Human.population += 1 ;
    }
}
