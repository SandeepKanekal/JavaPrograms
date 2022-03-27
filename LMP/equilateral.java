package LMP;

import java.util.Scanner;

class equilateral {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 3 sides of the triangle");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if (a == b && b == c)
      System.out.println("Equileteral Triangle");
    else if (a != b && b != c && c != a)
      System.out.println("Scalene Triangle");
    else
      System.out.println("Isoceles Triangle");
    sc.close();
  }
}
