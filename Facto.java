import java.util.*;
class Facto{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();
        int fact=Factorial.FactorialOfNumber(n);
        System.out.println("Factorial of " +n +" = " +fact);
        sc.close();
    }
}