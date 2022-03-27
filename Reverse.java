import java.util.Scanner;
class Reverse
{
    public void display(int n)
    {
        int rev=0;
        while (n>0) {
            int t=n%10;
            rev=rev*10+t;
            n=n/10;
        }
        System.out.println(rev);
    }
    public static void main(String[] args){
        Reverse ObjReverse=new Reverse();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number");
        int Number=input.nextInt();
        ObjReverse.display(Number);
        input.close();
    }
}