
//PROGRAM TO CALULATE THE AREA OF A TRIANGLE WHOSE COORDINATES ARE GIVEN 
import java.util.*;

class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER X1");
        double x1 = sc.nextDouble();
        System.out.println("ENTER Y1");
        double y1 = sc.nextDouble();
        System.out.println("ENTER X2");
        double x2 = sc.nextDouble();
        System.out.println("ENTER Y2");
        double y2 = sc.nextDouble();
        System.out.println("ENTER X3");
        double x3 = sc.nextDouble();
        System.out.println("ENTER Y3");
        double y3 = sc.nextDouble();
        if ((x1 == x2 & x2 == x3) | (y1 == y2 & y2 == y3))
            System.out.println("NOT A TRIANGLE");
        else {
            double a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
            double b = Math.sqrt(Math.pow((x2 - x3), 2) + Math.pow((y2 - y3), 2));
            double c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("AREA OF THE TRIANGLE = " + area + " SQ. UNITS");
        }
        sc.close();
    }
}