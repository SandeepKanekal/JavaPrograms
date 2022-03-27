package Worksheets.Functions;

import java.util.Scanner;

public class Student {
    String name;
    int age;
    double Mark1;
    double Mark2;
    double Mark3;
    double maximum;
    double average;

    public void accept() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter full name, age and Worksheets.Arrays.marks in the 3 subjects");
        name = input.nextLine();
        age = input.nextInt();
        Mark1 = input.nextDouble();
        Mark2 = input.nextDouble();
        Mark3 = input.nextDouble();
        input.close();
    }

    public void compute() {
        maximum = Mark1 + Mark2 + Mark3;
        average = maximum / 3;
    }

    public void display() {
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + Mark1 + ", " + Mark2 + ", " + Mark3);
        System.out.println("Maximum: " + maximum);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args) {
        Student ObjStudent = new Student();
        ObjStudent.accept();
        ObjStudent.compute();
        ObjStudent.display();
    }
}
