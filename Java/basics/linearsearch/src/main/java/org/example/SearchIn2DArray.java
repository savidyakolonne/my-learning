package org.example;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {14, 78, 98},
                {45, 99, 58, 34, },
                {22, 48, 5, },
                {87, 4, 46, 11}
        } ;

        int target =  34 ;
        int[] ans = search(arr, target) ;
        System.out.println(Arrays.toString(ans));
        System.out.println(Integer.MIN_VALUE);
    }

//    static boolean search(int[][] arr , int target){
//        for(int row = 0 ; row < arr.length ; row++){
//            for(int col = 0 ; col < arr[row].length ; col++){
//                if( target == arr[row][col]){
//                    return true ;
//                }
//            }
//
//        }return false ;
//    }

    static int[] search(int[][] arr , int target){
        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                if( target == arr[row][col]){
                    return new int[]{row, col};
                }
            }

        }return new int[]{-1, -1};
    }

}
