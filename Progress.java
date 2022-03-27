import java.util.Scanner;

public class Progress {
    final double weight1;
    final double weight2;
    final double weight3;
    final double weight4;
    final double weight5;
    final double weight6;
    double average;

    public Progress() {
        weight1 = 10;
        weight2 = 10.2;
        weight3 = 10.4;
        weight4 = 10.6;
        weight5 = 10.8;
        weight6 = 11;
    }

    public Progress(double w1, double w2, double w3, double w4, double w5, double w6) {
        weight1 = w1;
        weight2 = w2;
        weight3 = w3;
        weight4 = w4;
        weight5 = w5;
        weight6 = w6;
    }

    public void average() {
        average = (weight1 + weight2 + weight3 + weight4 + weight5 + weight6) / 6;
    }

    public void show() {
        System.out.println("Weight in 1st month : " + weight1 + " Kilograms");
        System.out.println("Weight in 2nd month : " + weight2 + " Kilograms");
        System.out.println("Weight in 3rd month : " + weight3 + " Kilograms");
        System.out.println("Weight in 4th month : " + weight4 + " Kilograms");
        System.out.println("Weight in 5th month : " + weight5 + " Kilograms");
        System.out.println("Weight in 6th month : " + weight6 + " Kilograms");
        System.out.println("Average weight : " + average + " Kilograms");
    }

    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of 6 months");
        double W1 = sc.nextDouble();
        double W2 = sc.nextDouble();
        double W3 = sc.nextDouble();
        double W4 = sc.nextDouble();
        double W5 = sc.nextDouble();
        double W6 = sc.nextDouble();
        Progress DefObj = new Progress();
        Progress ParObj = new Progress(W1, W2, W3, W4, W5, W6);
        System.out.println("\nFirst six months");
        DefObj.average();
        DefObj.show();
        System.out.println("\nNext six months");
        ParObj.average();
        ParObj.show();
        sc.close();
    }
}
