package Worksheets.Arrays;

import java.util.Scanner;

public class capital {
    public static void main(String[] args) {
        String[] state = new String[5];
        String[] capital = new String[5];
        boolean isPresent = false;
        int m;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < state.length; i++) {
            // input
            System.out.println("Enter state name");
            state[i] = sc.next();
            System.out.println("Enter capital name");
            capital[i] = sc.next();
        }

        System.out.println();
        System.out.println("Enter searching element");  // search element
        String searchState = sc.next();
        for (m = 0; m < state.length; m++) {
            // linear search (looping through each element in the array and comparing it to the search element)
            if (state[m].equalsIgnoreCase(searchState)) {
                isPresent = true;  //flag
                break;
            }
        }
        if (isPresent)
            System.out.print("Capital of " + searchState + " is " + capital[m]);
        else
            System.out.print(searchState + " is not present in the array");
        sc.close();
    }
}
