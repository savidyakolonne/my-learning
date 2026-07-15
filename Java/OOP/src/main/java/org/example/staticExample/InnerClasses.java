package org.example.staticExample;

//only can be static inner classes

//static class A {
//    class Test{
//
//    }
//}

public class InnerClasses {

     static class Test{
        String name;

        public Test(String name){
            this.name = name;
        }

        @Override
        public String toString(){
            return name;
        }
    }

    public static void main(String[] args){
         Test a = new Test("Kunal");
         Test b = new Test("Savidya");

        System.out.println(a);
        // give the random value
//        org.example.packages.staticExample.InnerClasses$Test@1b28cdfa

        // but ,
        // when run with the toString method can see the String (overriding)
    }
}
