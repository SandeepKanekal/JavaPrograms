package Worksheets.Arrays;
public class Array{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int s = 5;
        for (int i: a){ // for each_item in the array
            if (i == s)
                System.out.println("found " +s);
        }
    }
}