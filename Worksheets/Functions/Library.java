package Worksheets.Functions;

import java.util.Scanner;

public class Library {
    int AccNum;
    String title;
    String AuthorName;
    int DaysLate;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Accession number, title of the book and the name of the AuthorName");
        AccNum = sc.nextInt();
        title = sc.nextLine();
        AuthorName = sc.nextLine();
    }

    public void compute() {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days late");
        DaysLate = sc.nextInt();
    }

    public void display() {
        System.out.println();
        System.out.println("Accession Number\tTitle\tAuthor");
        System.out.println(AccNum + "\t\t" + title + "\t" + AuthorName);
        System.out.println();
        System.out.println("Fine: Rs." + (DaysLate * 2));
    }

    public static void main(String[] args) {
        Library ob = new Library();
        ob.input();
        ob.compute();
        ob.display();
    }
}
