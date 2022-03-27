/*
Define a class to accept 10 states and their capitals in two different Single
Dimensional Array. Enter the name of a state and search it in the given list of state
names. If it is present then display its capital , otherwise display “State name is not
enlisted”.
 */
package SamplePapers;

import java.util.Scanner;

public class Capital {
    public static void main(String[] args) {
        String[] state = new String[10];
        String[] capital = new String[10];
        boolean isPresent = false;
        int m;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < state.length; i++) {
            System.out.println("Enter state name");
            state[i] = sc.next();
            System.out.println("Enter capital name");
            capital[i] = sc.next();
        }
        System.out.println();
        System.out.println("Enter searching element");
        String searchState = sc.next();
        for (m = 0; m < state.length; m++) {
            if (state[m].equalsIgnoreCase(searchState)) {
                isPresent = true;
                break;
            }
        }
        if (isPresent)
            System.out.print("Capital of " + searchState + " is " + capital[m]);
        else
            System.out.print("State name is not enlisted");
        sc.close();
    }
}
