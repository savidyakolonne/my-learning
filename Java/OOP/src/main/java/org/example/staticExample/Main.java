package org.example.staticExample;

public class Main {
    public static void main(String[] args) {
        Human savidya = new Human(23, "Savidya Kolonne", 1000, false);
        Human kunal = new Human(23, "Kunal Kushawaha", 1000000, false);

        System.out.println(savidya.name);

//        System.out.println(kunal.population);
//        System.out.println(savidya.population);

//        convention

        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
