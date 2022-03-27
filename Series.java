import java.util.*;
class Series{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO OPERATE ON AND THE LIMIT");
        int x=sc.nextInt();
        int n=sc.nextInt();
        double sum=0;
        double fact=1;
        for(int i=1;i<=n;i++){
            fact=1;
            for(int j=1;j<=(i+1);j++)
            fact*=j;
            sum+=(x+i)/fact;
        }
        System.out.println("SUM = " +sum);
        sc.close();
    }
}