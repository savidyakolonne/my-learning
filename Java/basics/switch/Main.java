import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String fruit = input.nextLine() ;

        switch(fruit){
            case "mango":
                System.out.println("mango fruit");
                System.out.print("enter the status: ");
                String statusm = input.next() ;
                switch (statusm){
                    case "good" :
                        System.out.println("good mango");
                        break;
                    case "notgood" :
                        System.out.println("not a good mango");
                        break;
                    default:
                        System.out.println("enter good or not.");
                }
                break ;
            case "apple":
                System.out.println("apple fruit");
                System.out.print("enter the status: ");
                String statusa = input.next() ;
                switch (statusa){
                    case "good" :
                        System.out.println("good apple");
                        break;
                    case "notgood" :
                        System.out.println("not a good apple");
                        break;
                    default:
                        System.out.println("enter good or not.");
                }
                break ;
            default:
                System.out.println("enter a valid fruit name");
        }

    }
}
