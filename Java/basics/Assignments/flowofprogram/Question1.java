package flowofprogram;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        checkLeapYear() ;
    }

    static  void checkLeapYear(){
        Scanner in = new Scanner(System.in);

        int year = in.nextInt() ;

        if(year % 400 == 0 ){
            if(year % 100 == 0 ){
                if(year % 4 == 0 ){
                    System.out.println(year + " is a leap year");
                }
            }
        } else{
            System.out.println(year + " Not a leap year");
        }
    }
}
