package flowofprogram;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sum = 0;

        while (true) {
            String input = in.next();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            sum += Integer.parseInt(input);
        }

        System.out.println("Sum = " + sum);
    }
}

