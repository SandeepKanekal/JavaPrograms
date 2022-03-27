package Worksheets.Arrays;

import java.util.Scanner;

public class EmployeeAge {
    public static void main(String[] args) {
        int[] ages = new int[10];
        int from21to30 = 0;
        int from31to40 = 0;
        int from41to50 = 0;
        int from51to60 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ages");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
            if (ages[i] >= 21 && ages[i] <= 30) from21to30++;
            else if (ages[i] >= 31 && ages[i] <= 40) from31to40++;
            else if (ages[i] >= 41 && ages[i] <= 50) from41to50++;
            else from51to60++;
        }
        System.out.println("21 to 30 : " + from21to30);
        System.out.println("31 to 40 : " + from31to40);
        System.out.println("41 to 50 : " + from41to50);
        System.out.println("51 to 60 : " + from51to60);
        sc.close();
    }
}
