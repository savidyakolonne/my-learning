package org.example;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 23, 85, 14, 59} ;
        int target = 85 ;
        System.out.println(search(arr, target , 1, 4));
        
    }

    static int search(int[] arr, int target , int start , int end){
        if(arr.length == 0 ){
            return -1 ;
        }

        for (int index = start ; index <= end ; index++) {
            int element = arr[index] ;
            if(element == target){
                return index;
            }
        }
        return -1;

    }
}
