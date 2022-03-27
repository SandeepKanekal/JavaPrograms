package Worksheets.Arrays;

import java.util.Scanner;

public class Temperature {
    static String[] city = new String[5];
    static double[] temperature = new double[5];
    static int lowerLimit;
    static int upperLimit = city.length - 1;
    static boolean isPresent;
    static int average;
    static String searchElement;
    static int i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Enter 5 cities and their temperature");
        for (i = 0; i < temperature.length; i++) {
            city[i] = sc.next();
            temperature[i] = sc.nextDouble();
        }
        System.out.println("\nEnter the searching element");
        searchElement = sc.next();

        // using binary search
        while (lowerLimit <= upperLimit) {
            average = (upperLimit + lowerLimit) / 2;
            //compareToIgnoreCase helps in comparing if the value of <searchElement> is less/more than <city[average]>
            if (searchElement.compareToIgnoreCase(city[average]) < 0) upperLimit = average - 1;
            else if (searchElement.compareToIgnoreCase(city[average]) > 0) lowerLimit = average + 1;
            else {
                isPresent = true;
                break;
            }
        }
        if (isPresent)
            System.out.println("Temperature of " + city[average] + " is " + temperature[average]);
        else
            System.out.println("City not found");
    }
}
