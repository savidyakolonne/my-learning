package org.example.properties.Inheritance.types;

public class Main {
    public static void main(String[] args) {

        // 1. single level inheritance
        /*
            Box
              |
            BoxWeight
        */

        // 2. multi level inheritance
        /*
            Box
              |
            BoxWeight
              |
            BoxPrice
        */

        // 3. multiple inheritance (not in the java do this)
        /*
              A                B
              |                |
              ________ C________

                And with do this with interfaces
        */

        // 4. hierarchical inheritance
        /*
              ________A________
              |       |        |
              B       C        D
        */

        // 5. Hybrid inheritance
        /*
              ________A________
              |       |        |
              B       C        D
        */

        // box
        Box box1 = new Box(1, 2, 3);
        System.out.println(box1.w);

        //box weight

    }
}
