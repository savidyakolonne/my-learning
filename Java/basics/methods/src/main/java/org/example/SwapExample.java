package src.main.java.org.example;

public class SwapExample {
    public static void main(String[] args) {
        int a = 5 ;
        int b  = 6 ;
        System.out.println(a + ", " + b);

        swap(a,b);
        System.out.println("swaped version: " + a + ", " + b);

        String name = "savidya" ;
        System.out.println(name);
        changeName(name) ;
        System.out.println("changed name " + name);

    }

    static void swap(int num1 , int num2){
        int temp ;
        temp =  num1 ;
        num1 = num2 ;
        num2 = temp ;

    }

    static void changeName(String name){
        name = "rahul" ;
    }
}
