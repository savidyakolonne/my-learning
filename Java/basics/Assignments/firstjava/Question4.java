package firstjava;

//Take in two numbers and an operator (+, -, *, /) and calculate the value.

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = in.nextInt() ;

        System.out.print("Enter the second number: ");
        int num2 = in.nextInt() ;

        System.out.print("Enter the operator(+, -, *, / ): ");
        char c = in.next().charAt(0) ;

        if(c == '+'){
            System.out.println(num1 + num2);
        } else if (c == '-') {
            System.out.println(num1 - num2);
        } else if (c == '*') {
            System.out.println(num1 * num2);
        } else if (c == '/') {
            System.out.println(num1 / num2);
        }else {
            System.out.println("Invalid character entered!!!!!");
        }


//        if(c == '+'){
//            sum(num1 , num2);
////        } else if (c == '-') {
////            System.out.println(num1 - num2);
////        } else if (c == '*') {
////            System.out.println(num1 * num2);
////        } else if (c == '/') {
////            System.out.println(num1 / num2);
//        }else {
//            System.out.println("Invalid character entered!!!!!");
//        }
//    }
//
//    static void sum(int num, int num){
//        itn sum = num1  + nm2 ;
//        return sum ;
//    }
    }
}
