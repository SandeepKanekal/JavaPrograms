package Worksheets.Functions;

import java.util.Scanner;

public class FruitJuice {
    int ProductCode;
    String flavour;
    String PackType;
    int PackSize;
    double ProductPrice;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details");
        ProductCode = sc.nextInt();
        flavour = sc.nextLine();
        PackType = sc.nextLine();
        PackSize = sc.nextInt();
        ProductPrice = sc.nextDouble();
        sc.close();
    }

    public void discount() {
        ProductPrice -= 10.0;
    }

    public void display() {
        System.out.println();
        System.out.println("Product Code: " + ProductCode);
        System.out.println("Flavour :" + flavour);
        System.out.println("Pack Type: " + PackType);
        System.out.println("Pack Size: " + PackSize + "ml");
        System.out.println("Product Price: Rs." + ProductPrice);
    }

    public static void main(String[] args) {
        FruitJuice ob = new FruitJuice();
        ob.input();
        ob.discount();
        ob.display();
    }
}