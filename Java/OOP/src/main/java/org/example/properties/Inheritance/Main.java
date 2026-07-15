package org.example.properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4); // call the method with one arg

        Box box2 = new Box(4.2, 4.1, 4.4); // call the method with three args

        Box box3 = new Box(box1); // call the old one

        System.out.println(box1.l + " " + box1.w + " " + box1.h);
        System.out.println(box2.l + " " + box2.w + " " + box2.h);
        System.out.println(box3.l + " " + box3.w + " " + box3.h);

        // weight obj
        BoxWeight weightedBox = new BoxWeight(2, 3, 4, 8);
        System.out.println(weightedBox.l + " " + weightedBox.w + " " + weightedBox.h + " " + weightedBox.weight);
    }
}
