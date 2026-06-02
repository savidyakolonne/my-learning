package org.example;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String outputName = inputName.nextLine();

        System.out.println("Hello, " + outputName + ". welcome!");
    }
}
