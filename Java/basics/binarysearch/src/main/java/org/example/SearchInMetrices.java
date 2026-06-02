package org.example;

import java.util.Arrays;

public class SearchInMetrices {
    public static void main(String[] args) {

        int[][] arr = {
                {18, 9, 12} ,
                {36, -4, 91},
                {44, 33, 16}
        } ;

        int target = 91 ;

        int[] ans = search(arr, target) ;
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target){

        for(int r = 0; r < arr.length ; r++){
            for(int c = 0 ; c< arr[r].length ; c++ ){
                if (target == arr[r][c]){
                    return new int[]{r, c};
                }
            }
        }return new int[]{-1, -1} ;
    }
}
