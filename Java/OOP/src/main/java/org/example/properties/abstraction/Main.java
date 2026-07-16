package org.example.properties.abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.career();

        Daughter daughter = new Daughter();
        daughter.career();

        // cant make object of the abstract classes
//        Parent mom = new Parent();

        Parent.hello();
    }

}
