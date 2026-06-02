import java.util.Arrays;

public class SwaingArrayElements {
    public static void main(String[] args) {

        int[] arr = {14, 54, 11, 99, 44};
        int[] reverseArr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));
        swap(arr, 0 , 1 );
        System.out.println("swaped: " +  Arrays.toString(arr));

        System.out.println(Arrays.toString(reverseArr));
        reverse(reverseArr);
        System.out.println("reversed: " + Arrays.toString(reverseArr));
    }

    static void swap(int[] arr , int index1, int index2) {
        int temp = arr[index1] ;
        arr[index1] = arr[index2] ;
        arr[index2] = temp ;
    }

    static void reverse(int[] arr){

//        int temp = arr[arr.length - 1] ;
//        arr[arr.length - 1] = arr[0] ;
//        arr[0] = temp  ;

//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = arr[i];
//            arr[i] = temp;
//        }

        //two pointer method
        int start = 0 ;
        int end = arr.length - 1 ;

        while(start < end){
            swap(arr, start, end) ;
            start++ ;
            end-- ;
        }


    }

}
