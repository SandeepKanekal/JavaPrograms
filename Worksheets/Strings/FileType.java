package Worksheets.Strings;

import java.util.Scanner;

public class FileType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter location of file");
        String location = sc.nextLine();
        System.out.print("File Type: ");
        System.out.print(location.substring(location.lastIndexOf('.') + 1));
        sc.close();
    }
}