import java.util.*;
class multiply
{
    public void mul(int n)
    {
        for(int i=1;i<=10;i++)
        System.out.println(n+" X " +i + " = " +(n*i));
    }
    public static void main(String[] args)
    {
        multiply ob=new multiply();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();
        ob.mul(n);
        sc.close();
    }
}