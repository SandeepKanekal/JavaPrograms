package Worksheets.Constructors;

public class Box {
    final double length;
    final double width;
    final double height;

    public Box() {
        length = 0;
        width = 0;
        height = 0;
    }

    public Box(double l, double b, double h) {
        length = l;
        width = b;
        height = h;
    }

    public static void main(String[] args) {
        Box obj=new Box();
        Box ob=new Box(3.89, 2.1, 1.5);
        System.out.println();
        System.out.println("Volume = " + (ob.length*ob.width*ob.height) + "cm^2");
    }
}
