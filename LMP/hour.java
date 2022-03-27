package LMP;

import java.util.Scanner;

class hour {
    public static void main(String[] agrs) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter time in hours");
        int h=sc.nextInt();
        int r = 0;
        if (h <= 8)
            r = 10;
        else if (h <= 16)
            r = 10 + 6;
        else r = 10 + 6 + 5;
        System.out.println(" for no:of hrs: " + h + " rate=: " + r);
        sc.close();
    }
}
