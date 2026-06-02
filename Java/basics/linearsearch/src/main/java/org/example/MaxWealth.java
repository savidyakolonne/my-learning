package org.example;

import java.util.Arrays;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        //[[2,8,7],[7,1,3],[1,9,5]]

        System.out.println(maximumWealth(accounts));

    }

    static int maximumWealth(int[][] accounts){
        int total =0 ;
        int wealth = 0 ;
        for (int i = 0; i < accounts.length ; i++) {
            for(int j = 0 ; j < accounts[i].length ; j++ ){
                total += accounts[i][j];
            }
            int tempWealth = total ;
            if(tempWealth >= wealth ){
                wealth = tempWealth ;
                total = 0 ;
            }
            total = 0 ;
        }
        return wealth ;
    }


}
