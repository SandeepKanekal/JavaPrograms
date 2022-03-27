package Worksheets.Arrays;

import java.util.Scanner;

public class MaxMinMarks {
    public static void main(String[] args) {
        int[] marks = new int[5];
        int maxMark = 0;
        int minMark = 100; // if this was 0, the value would not be updated in line 16, thus making 0 the least mark scored, even if no student had scored 0 marks
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 marks");
        for (int i = 0; i < marks.length; i++)
            marks[i] = sc.nextInt();
        for (int mark : marks) {
            maxMark = Math.max(maxMark, mark);
            minMark = Math.min(minMark, mark);
        }
        System.out.println("Highest mark : " +maxMark);
        System.out.println("Lowest mark : " +minMark);
        sc.close();
    }
}
