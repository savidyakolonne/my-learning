package flowofprogram;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        mutliTable() ;
    }

    static void mutliTable(){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
/*

2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12

*/
        for (int i = 1; i < 13 ; i++) {
            System.out.println(num + " * " + i  + " = " + num * i );
        }
        System.out.println();

    }
}
