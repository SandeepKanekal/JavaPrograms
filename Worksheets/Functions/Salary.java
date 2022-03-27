package Worksheets.Functions;

import java.util.Scanner;

class Salary {
    String name;
    String address;
    long PhoneNumber;
    String SubjectSpec;
    double MonthlySalary;
    double IncomeTax;

    public void accept() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter details");
        name = input.nextLine();
        address = input.nextLine();
        PhoneNumber = input.nextLong();
        SubjectSpec = input.nextLine();
        MonthlySalary = input.nextDouble();
        input.close();
    }

    public void IT_Calc() {
        if (MonthlySalary * 12 > 175000)
            IncomeTax = 0.05 * MonthlySalary * 12;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
        System.out.println("Phone Number : " + PhoneNumber);
        System.out.println("Subject Specialization : " + SubjectSpec);
        System.out.println("Monthly Salary : " + MonthlySalary);
        System.out.println("Income tax : " + IncomeTax);
    }

    public static void main(String[] args) {
        System.out.println();
        Salary Obj = new Salary();
        Obj.accept();
        Obj.IT_Calc();
        Obj.display();
    }
}