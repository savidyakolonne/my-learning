package firstjava;

//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = in.nextLine();
        greet(name) ;
    }

    static void greet(String name){
        System.out.println("Hello " + name);

    }


}
