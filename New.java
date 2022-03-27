import java.util.*;

class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A DEGREE VALUE");
        double n = sc.nextDouble();
        if (n >= 0 && n <= 90) {
            System.out.println("sin " + n + " = " + Math.sin(Math.toRadians(n)));
            System.out.println("cos " + n + " = " + Math.cos(Math.toRadians(n)));
            System.out.println("tan " + n + " = " + Math.tan(Math.toRadians(n)));
            System.out.println("cot " + n + " = " + Math.atan(Math.toRadians(n)));
            System.out.println("sec " + n + " = " + Math.acos(Math.toRadians(n)));
            System.out.println("cosec " + n + " = " + Math.asin(Math.toRadians(n)));
        } else if (n < 0)
            System.out.println("ENTER A VALUE MORE THAN OR EQUAL TO 0");
        else if (n > 90)
            System.out.println("ENTER A VALUE LESSER THAN OR EQUAL TO 90");
        sc.close();
    }
}