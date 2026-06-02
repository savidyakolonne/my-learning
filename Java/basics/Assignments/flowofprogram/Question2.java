package flowofprogram;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        sumNumbers() ;
    }

    static void sumNumbers(){
        Scanner input = new Scanner(System.in);

        System.out.println("enter first num: ");
        int num1 = input.nextInt() ;
        System.out.println("enter second num: ");
        int num2 = input.nextInt() ;

        int sum = num1 + num2  ;
        System.out.println("Sum is "  + sum);

    }
}
