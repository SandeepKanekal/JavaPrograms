import java.util.Scanner;
public class DefaultConstructor {
    final int Number1;
    final int Number2;
    int Sum;
    public DefaultConstructor(int a, int b){
        Number1=a;
        Number2=b;
    }
    public void Caclculate(){
        Sum=Number1+Number2;
        System.out.println(Number1 +" + " +Number2 +" = " +Sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int Number1=sc.nextInt();
        int Number2=sc.nextInt();
        DefaultConstructor ob=new DefaultConstructor(Number1, Number2);
        ob.Caclculate();
        sc.close();
    }
}
