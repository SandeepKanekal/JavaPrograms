package Worksheets.Constructors;
import java.util.Scanner;
public class Programming {
    String ProgrammingLanguage="programming languages";
    public Programming(){
        System.out.println("I love " +ProgrammingLanguage);
    }
    public Programming(String NameOfProgrammingLanguage){
        ProgrammingLanguage=NameOfProgrammingLanguage;
        System.out.println("I love " +ProgrammingLanguage);
    }
    public static void main(String[] args){
        System.out.println("\nEnter your favourite programming language");
        Scanner sc=new Scanner(System.in);
        String nameOfProgrammingLanguage=sc.next();
        int lengthOfString=nameOfProgrammingLanguage.length();
        if(lengthOfString==0)
        new Programming();
        else
        new Programming(nameOfProgrammingLanguage);
        sc.close();
    }
}
