package Worksheets.Constructors;

import java.util.Scanner;

public class Student2 {
    final String name;

    public Student2() {
        name="Unknown";
    }

    public Student2(String n) {
        name = n;
    }

    public void display(){
        System.out.println("Name: " +name);
    }

    public static void main(String[] args){
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String Name=sc.next();
        Student2 obj=new Student2();
        Student2 ob=new Student2(Name);
        int lengthOfString=Name.length();
        if(lengthOfString==0)
        obj.display();
        else
        ob.display();
        sc.close();
    }
}
