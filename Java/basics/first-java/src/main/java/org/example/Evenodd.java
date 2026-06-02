package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Evenodd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int output = input.nextInt();

        if(output % 2 == 0 ){
            System.out.println(output + " is an even number");
        }else{
            System.out.println(output + " is an odd number");
        }


    }
}