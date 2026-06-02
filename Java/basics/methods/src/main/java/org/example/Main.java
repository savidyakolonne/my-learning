package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner inputmain = new Scanner(System.in);
        System.out.print("Enter 0 exit and 1 to enroll sum: ");
        int choice = inputmain.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Exited!!!!0");
                return;

            case 1:
                System.out.println(" - Enrolled to sum - ");
                sum();
                break;
            default:
                System.out.print("enter a valid option");
                menu();
        }

    }

        public static void sum(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            int numOne = input.nextInt();

            System.out.print("Enter the second number: ");
            int numTwo = input.nextInt() ;

            int sum = numOne + numTwo ;
            System.out.println("Sum is: " +  sum);
            menu();
        }


}


