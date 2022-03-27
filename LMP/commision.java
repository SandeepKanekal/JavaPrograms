package LMP;

import java.util.Scanner;

class commision {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter sales");
    int sales = sc.nextInt();
    int rate = 0;
    double commission = 0.0;
    if (sales <= 20000) {
      rate = 3;
      commission = sales * .03;
    }
    if (sales >= 20001 && sales <= 50000) {
      rate = 12;
      commission = sales * .12;
    }
    if (sales >= 50001) {
      rate = 31;
      commission = sales * .31;
    }
    System.out.println("Commission Rate : " + rate + "%");
    System.out.println("Commission Amount : " + commission);
    sc.close();
  }
}
