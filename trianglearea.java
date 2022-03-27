import java.util.*;

class trianglearea {
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER METHOD OF CALCULATING AREA OF THE TRIANGLE");
        System.out.println("1.REGULAR METHOD");
        System.out.println("2.HERON'S METHOD");
        int n = sc.nextInt();
        switch (n) {
            case 1 -> {
                System.out.println("ENTER BASE");
                double base = sc.nextDouble();
                System.out.println("ENTER HEIGHT");
                double height = sc.nextDouble();
                double area = 0.5 * base * height;
                System.out.println("AREA OF THE TRIANGLE = " + area + " Sq.Units");
            }
            case 2 -> {
                System.out.println("ENTER SIDE1");
                double s1 = sc.nextDouble();
                System.out.println("ENTER SIDE2");
                double s2 = sc.nextDouble();
                System.out.println("ENTER SIDE3");
                double s3 = sc.nextDouble();
                double s = (s1 + s2 + s3) / 2;
                double area2 = Math.sqrt(s * (s + s1) * (s + s2) * (s * s3));
                System.out.println("AREA OF THE TRIANGLE = " + area2 + " Sq.Units");
            }
            default -> System.out.println("ENTER EITHER 1 OR 2");
        }
        sc.close();
    }

    public static void main(String[] args) {
        trianglearea ob = new trianglearea();
        ob.area();
    }
}