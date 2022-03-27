package LMP;
import java.util.Scanner;
class power2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum=0;
        int i=1;
        int m=1;
        while(i<=n)
        {
            sum+=(m*(int)Math.pow(i,i)/i);
            m*=-1;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
}