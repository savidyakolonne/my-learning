package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        String[] names = new String[5];

        // data of 5 students (roll no, name, mark)
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        Student savidya = new Student();

        savidya.rno = 16;
        savidya.name = "Savidya Kolonne";
        savidya.marks = 84.5f;

        System.out.println(savidya.rno);
        System.out.println(savidya.name);
        System.out.println(savidya.marks);

        // new student
        Student student1 = new Student(29, "Kunal Kushwaha", 99.5f);
        System.out.println(student1.name);

        //
        Student student = new Student(20, "Student name", 100.0f);
        System.out.println(student.marks);
    }
}
// class content with properties and different values - like a template
// create a class
//for every single student
class Student{
    int rno;
    String name;
    float marks;

    // we need a way to add values of above
    // properties object by object

    // we need one word to access every object

    Student(){
        this.rno = 23;
        this.name = "Saviyda Kolonne";
        this.marks = 88.5f;
    }

//    Student(int rno, String name, float marks){
//        this.rno = rno;
//        this.name = name;
//        this.marks = marks;
//    }
//    same to this  =>

    Student(int studentRno, String studentName, float studentMarks){
        this.rno = studentRno;
        this.name = studentName;
        this.marks = studentMarks;
    }
}