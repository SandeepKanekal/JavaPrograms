package Worksheets.Constructors;
import java.util.Scanner;
public class Employee{
    final String code;
    final String name;
    final double basic;
    double HRA;
    double DA;
    double PF;
    public Employee(){
        code=null;
        name=null;
        basic=0;
        HRA=0;
        DA=0;
        PF=0;
    }
    public Employee(String c, String n, double b){
        code=c;
        name=n;
        basic=b;
    }
    public static void main(String[] args){
        Employee obj=new Employee();
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter details");
        String a=sc.next();
        String b=sc.next();
        double c=sc.nextDouble();
        Employee ob=new Employee(a,b,c);
        System.out.println();
        System.out.println("Code: " +ob.code);
        System.out.println("Name: " +ob.name);
        System.out.println("Basic: Rs." +ob.basic);
        ob.HRA=0.1*ob.basic;
        ob.DA=0.55*ob.basic;
        ob.PF=1000;
        System.out.println("HRA: Rs." +ob.HRA);
        System.out.println("DA: Rs." +ob.DA);
        System.out.println("PF: Rs." +ob.PF);
        System.out.println("Net Salary: Rs." +((ob.basic+ob.DA+ob.HRA)-ob.PF));
        sc.close();
    }
}