package Worksheets.Arrays;

import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        String[] names = new String[5];
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name");
            names[i] = sc.next();
            System.out.println("Enter marks");
            marks[i] = sc.nextInt();
        }
        int maxMark = 0;
        String maxMarkStudent = null;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > maxMark) {
                // checking if the marks in the array of index <i> is greater than maxMark
                // if yes, the maxMark and maxMarkStudent is also updated
                maxMark = marks[i];
                maxMarkStudent = names[i];
            }
        }
        System.out.println("Highest marks scored by : " + maxMarkStudent + "\n" + maxMarkStudent + " scored : " + maxMark);
        sc.close();
    }
}
