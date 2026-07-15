package org.example.packages;

// import the class including the method greet()
import static org.example.packages.b.Greeting.greet;

public class Message {
    public static void main(String[] args) {
        System.out.println("Import from other files");
        greet();
    }
}
