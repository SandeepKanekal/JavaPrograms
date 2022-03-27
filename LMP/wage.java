package LMP;

import java.util.Scanner;

class wage {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter hours and rate");
    int h = sc.nextInt();
    int r = sc.nextInt();
    double W = 0;
    if (h <= 40)
      W = h * r;
    else if (h <= 56)
      W = 40 * r + (h - 40) * r * 1.25;
    else W = 40 * r + 16 * r * 1.25 + (h - 56) * r * 1.5;
    System.out.print("The Weekly Wages : " + W);
    sc.close();
  }
}
