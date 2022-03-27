package LMP;

import java.util.Scanner;

class bill {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter unit and customer number");
    int unit = sc.nextInt();
    int customerNo = sc.nextInt();
    double bill = 0;
    if (unit <= 80)
      bill = 250;
    else if (unit <= 140)
      bill = 250 + (unit - 80) * 0.60;
    else if (unit <= 200)
      bill = 250 + 36 + (unit - 140) * 0.50;// 36 is 60 calls made multiplied to 0.60
    else bill = 250 + 36 + 30 + (unit - 200) * 0.40;// 30 is the 60 calls made multiplied to 0.50
    System.out.println("CUSTOMER NUMBER : " + customerNo);
    System.out.println("MESSAGE unit : " + unit);
    System.out.println("BILL AMOUNT : " + bill);
    sc.close();
  }
}
