package org.example;

import java.util.Scanner;

public class FibonacciCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int n = input.nextInt();

        // number + sum of previous numbers
        // 0 , 1 , 1 ,  2, 3 , 5 , 8, 13, 21, 34, 55 ,...

        int x ;
        for( x = 0 ; x <= n ; x++){

            System.out.println(x);

        }

    }
}
