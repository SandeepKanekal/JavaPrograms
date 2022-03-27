package Worksheets.Functions;

import java.util.Scanner;

public class Mobike {
    int BikeNumber;
    long PhoneNumber;
    String name;
    int days;
    int charge;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bike number, phone number, full name and number of days of travel");
        BikeNumber = sc.nextInt();
        PhoneNumber = sc.nextLong();
        name = sc.nextLine();
        days = sc.nextInt();
        sc.close();
    }

    public void compute() {
        if (days <= 5)
            charge = 500 * days;
        else if (days <= 10)
            charge = 500 * 5 + 400 * (days - 5);
        else
            charge = 500 * 5 + 400 * 5 + (days - 10) * 200;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Bike Number: " + BikeNumber);
        System.out.println("Phone Number: " + PhoneNumber);
        System.out.println("Days of travel: " + days);
        System.out.println("Charge: Rs." + charge);
    }

    public static void main(String[] args) {
        Mobike ObjMobike = new Mobike();
        ObjMobike.input();
        ObjMobike.compute();
        ObjMobike.display();
    }
}
