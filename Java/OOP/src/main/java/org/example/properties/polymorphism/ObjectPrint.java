package org.example.properties.polymorphism;

public class ObjectPrint {

    int num;

    public ObjectPrint(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(54);

        System.out.println(obj);
        // answer got the org.example.properties.polymorphism.ObjectPrint@65ab7765
    }
}
