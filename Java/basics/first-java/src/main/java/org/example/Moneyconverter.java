package org.example;

import java.util.Scanner;

public class Moneyconverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Rs amount: ");
        float output  = input.nextFloat();

        float outputUSD = output / 300 ;

        System.out.println(output + " rs is equal to " +  outputUSD + " USD");

    }
}
