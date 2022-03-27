package Worksheets.Arrays;

import java.util.Scanner;

public class CityTemp {
    public static void main(String[] args) {
        int[] temperature = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature of 5 cities in celsius");
        for (int i = 0; i < temperature.length; i++)  // input
            temperature[i] = sc.nextInt();
        int maxTemp = 0;
        for (int temp : temperature)  // looping through each element
            maxTemp = Math.max(maxTemp, temp);
        System.out.println("Maximum Temperature : " + maxTemp);
        sc.close();
    }
}
