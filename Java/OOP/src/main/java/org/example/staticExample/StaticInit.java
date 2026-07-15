package org.example.staticExample;

//this is a demo to show initialization of static variables

public class StaticInit {
    static int a = 4;
    static int b;

//  will only run once , when the first object is create i.e when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInit obj = new StaticInit();
        System.out.println(StaticInit.a + " " + StaticInit.b);

        StaticInit.b += 3;
        System.out.println(StaticInit.a + " " + StaticInit.b);

        StaticInit obj2 = new StaticInit();
        System.out.println(StaticInit.a + " " + StaticInit.b);
    }
}
