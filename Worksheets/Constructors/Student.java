package Worksheets.Constructors;

import java.util.Scanner;

public class Student {
    final String name;
    final int age;
    final int Marks1;
    final int Marks2;
    final int Marks3;
    int MaxMark;
    double average;

    public Student() {
        name = null;
        age = 0;
        Marks1 = 0;
        Marks2 = 0;
        Marks3 = 0;
        MaxMark = 0;
        average = 0;
    }

    public Student(String n, int a, int m1, int m2, int m3) {
        name = n;
        age = a;
        Marks1 = m1;
        Marks2 = m2;
        Marks3 = m3;
    }

    public void compute() {
        MaxMark=Math.max(Marks1, (Math.max(Marks2, Marks3)));
        average=(Marks1 + Marks2 + Marks3)/3;
    }

    public void display(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Marks: " +Marks1 +", " +Marks2 +", " +Marks3);
        System.out.println("Maximum Mark: " +MaxMark);
        System.out.println("Average: " +average);
    }

    public static void main(String[] args){
        System.out.println();
        System.out.println("Enter name, age and Worksheets.Arrays.marks of 3 subjects");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        int m1=sc.nextInt();
        int m2=sc.nextInt();
        int m3=sc.nextInt();
        Student obj=new Student();
        Student ob=new Student(name, age, m1, m2, m3);
        System.out.println();
        ob.compute();
        ob.display();
        sc.close();
    }
}
