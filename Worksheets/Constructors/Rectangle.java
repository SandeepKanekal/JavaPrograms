package Worksheets.Constructors;
import java.util.Scanner;
public class Rectangle {
    final double length;
    final double breadth;
    public Rectangle(){
        length=0;
        breadth=0;
    }
    public Rectangle(double a, double b){
        length=a;
        breadth=b;
    }
    public Rectangle(double c){
        length=c;
        breadth=c;
    }
    public void calc(){
        System.out.println("Area = " +(length*breadth) +" SQ. Units");
    }
    public static void main(String[] args){
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth");
        double L=sc.nextDouble();
        double D=sc.nextDouble();
        System.out.println("Enter side");
        double S=sc.nextDouble();
        Rectangle ob=new Rectangle();
        Rectangle ob1=new Rectangle(L,D);
        Rectangle ob2=new Rectangle(S);
        ob1.calc();
        ob2.calc();
        sc.close();
    }
}
