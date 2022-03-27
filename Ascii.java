import java.util.Scanner;
class Ascii
{
    public void ASC(char ch)
    {
        System.out.println(ch +" --> " +(int)ch);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("THIS PROGRAM DISPLAYS ASCII VALUES OF CHARACTERS-SO, ENTER ANY CHARACTER(A CHARACTER CAN BE A NUMBER, SYMBOL, ALPHABETS, SPACE ETC.)");
        char ch=sc.next().charAt(0);
        Ascii ob=new Ascii();
        ob.ASC(ch);
        sc.close();
    }
}