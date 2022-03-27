import java.util.*;
public class Automorphic {
   public void check(int n){
       int ori=n;
       int s=n*n;
       int c=0;
       while(n>0){
           c++;
           n/=10;
       }
       if(s%((int)Math.pow(10,c))==ori)
       System.out.println("AUTOMORPHIC NUMBER");
       else
       System.out.println("NOT AUTOMORPHIC");
   } 
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("ENTER A NUMBER");
       int n=sc.nextInt();
       Automorphic ob=new Automorphic();
       ob.check(n);
       sc.close();
   }
}
