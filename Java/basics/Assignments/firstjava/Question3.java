package firstjava;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double p = in.nextDouble() ;

        System.out.print("Enter the time: ");
        int t = in.nextInt() ;

        System.out.print("Enter the rate: ");
        double r = in.nextDouble() ;

        double si ;
        si = ( p * t * r ) / 100 ;
        System.out.println(si);
    }


}
