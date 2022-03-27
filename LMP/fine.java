package LMP;

import java.util.Scanner;

class fine {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of days");
    int Ndays = sc.nextInt();
    double fineAmount = 0.0;
    if (Ndays <= 5)
      fineAmount = Ndays * .45;
    else if (Ndays <= 10)
      fineAmount = Ndays * .65;
    else
      fineAmount = Ndays * .80;
    System.out.println("FINE AMOUNT (Rs.) : " + fineAmount);
    sc.close();
  }
}
