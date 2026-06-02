package org.example;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arrase = { 88, 55, 41, 35, 27, 18, 6, 5, 5, 3, 1};
        int[] arrdes = {1, 3, 5, 5, 6, 18, 27, 35, 41, 55, 88 } ;

        int target = 41 ;

        int ans = searchOABS(arrdes, target) ;
        System.out.println(ans);
    }

    static int searchOABS(int[] arr, int target){
        int f = arr[0] ;
        int l = arr[arr.length-  1 ] ;

        int start = 0;
        int end = arr.length - 1 ;

        if( f < l ){
//  ascending order
            while( start <= end ){
                int mid = start + ( end - start ) / 2 ;
                if( target > arr[mid]  ){
                    start = mid + 1 ;
                } else if (target < arr[mid] ) {
                    end = mid - 1 ;
                }else{
                    return mid;
                }
            }
        } else if (f > l) {

            while( start <= end ){
                int mid = start + ( end - start ) / 2 ;
                if( target > arr[mid]  ){
                    end = mid - 1 ;
                } else if (target < arr[mid] ) {
                    start = mid + 1 ;
                }else{
                    return mid;
                }
            }
        }else{
            System.out.println("not a sorted  as or des one");
        }
        return -1 ;
    }
}
