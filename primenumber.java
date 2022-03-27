class primenumber
{
    public boolean prime(int n)
    {
        boolean var=false;
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        var= c == 2;
        return var;
    }
    public static void main(String[] args)
    {
        Input in=new Input();
        System.out.println("Enter a number");
        int n=in.acceptInt();
        primenumber ob=new primenumber();
        boolean x=ob.prime(n);
        if(x)
        System.out.println("PRIME");
        else
        System.out.println("COMPOSITE");
    }
}