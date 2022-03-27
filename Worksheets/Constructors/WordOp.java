package Worksheets.Constructors;

import java.util.Scanner;

public class WordOp {
    char wordMax;
    char wordMin;
    String word;
    int greatestVal;
    int minVal;

    public WordOp() {
        wordMax = '\u0000';
        wordMin = '\u0000';
        word = null;
        greatestVal=65;
        minVal=90;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word in UPPERCASE");
        word = sc.next();
        sc.close();
    }

    public void calcMinMax() {
        for (int i = 0; i < word.length(); i++) {
            if ((int) word.charAt(i) > greatestVal)
                greatestVal = word.charAt(i);
            if ((int) word.charAt(i) < minVal)
                minVal = word.charAt(i);
        }
        wordMax=(char)greatestVal;
        wordMin=(char)minVal;
    }
    public void display(){
        System.out.println("HIGHEST CHARACTER : " +wordMax);
        System.out.println("lowest character : " +wordMin);
    }
    public static void main(String[] args){
        System.out.println();
        WordOp ob=new WordOp();
        ob.input();
        ob.calcMinMax();
        ob.display();
    }
}
