package Worksheets.Constructors;

import java.util.Scanner;

public class AddAmount {
    int Amount = 50;

    public AddAmount(int AmountToBeAdded) {
        Amount += AmountToBeAdded;
    }

    public void display() {
        System.out.println("Amount in piggy bank = Rs." + Amount);
    }

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to be added");
        int amountToBeAdded = sc.nextInt();
        AddAmount ParObj = new AddAmount(amountToBeAdded);
        ParObj.display();
        sc.close();
    }
}
