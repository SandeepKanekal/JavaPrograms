//this class is for extracting the factorial of a number from another class as it is such a big problem to calculate factorial
public class Factorial{
    public static int FactorialOfNumber(int n){
        int f=1;
        for(int i=1;i<=n;i++)
        f*=i;
        return f;
    }
}