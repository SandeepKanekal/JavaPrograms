package Worksheets.Constructors;

public class Triangle {
    final double hypotenuse;
    final double base;
    double perpendicular;
    public Triangle(double a, double b){
        hypotenuse=a;
        base=b;
    }
    public static void main(String[] args){
        Triangle ob=new Triangle(6.0, 4.0);
        System.out.println();
        System.out.print("Perperndicular = ");
        System.out.print(Math.sqrt((Math.pow(ob.hypotenuse, 2) - (Math.pow(ob.base, 2)))));
        System.out.print("cm");
    }
}
