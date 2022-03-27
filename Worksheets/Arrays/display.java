package Worksheets.Arrays;
import java.util.Scanner;
public class display {
    public static void main(String[] args){
        int[] n = new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for(int i=0;i<n.length;i++)
            n[i] = sc.nextInt();
        for (int j : n) System.out.println(j);
        sc.close();
    }
}
