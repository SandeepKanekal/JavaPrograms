package LMP;
import java.util.Scanner;
class gift
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the code, quantity and the rate");
    int code=sc.nextInt();
    int qty=sc.nextInt();
    double rate=sc.nextDouble();
    double price = qty*rate;
    String s="";
    System.out.println ("Purchase Price : "+price);
    if(price>= 100 && price<= 500)
      s= "Gift item : Key Ring";
    if(price>500 && price<= 1000)
      s="Gift item : Leather Purse";
    if(price>1000)
      s="Gift item : Pocket Calculator";
      System.out.println(s);
      sc.close();
  }
}
