public class Methods {

    public static boolean isPrimeNumber(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                counter++;
        }
        return counter == 2;
    }

    public static boolean isPalindrome(int n) {
        int original = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev == original;
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum == n;
    }

    public static boolean oddEven(int n) {
        return n % 2 == 0;
    }

    public static boolean palPrime(int n) {
        return Methods.isPrimeNumber(n) && Methods.isPalindrome(n);
    }

    public static double rectangleArea(double length, double breadth) {
        return length * breadth;
    }

    public static double squareArea(double side) {
        return side * side;
    }

    public static double triangleArea(double side1, double side2, double side3) {
        return Math.sqrt(
                ((side1 + side2 + side3) / 2) *
                        (((side1 + side2 + side3) / 2) + side1) *
                        (((side1 + side2 + side3) / 2) + side2) *
                        (((side1 + side2 + side3) / 2) + side3));
    }

    public static double triangleArea(double height, double base) {
        return 0.5 * base * height;
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double cuboidVolume(double length, double breadth, double height) {
        return length * breadth * height;
    }

    public static double cubeVolume(double side) {
        return side * side * side;
    }

    public static double coneVolume(double radius, double height) {
        return 1.0 / 3.0 * Methods.circleArea(radius) * height;
    }

    public static double sphereVolume(double radius) {
        return 4.0 / 3.0 * Methods.circleArea(radius) * radius;
    }

    public static double cylinderVolume(double radius, double height) {
        return Methods.circleArea(radius) * height;
    }

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static long toBinary(int decimalNumber) {
        long binaryNumber = 0L;
        int c = 0;
        while (decimalNumber > 0) {
            binaryNumber += Math.pow(2, c) * (decimalNumber % 10);
            c++;
            decimalNumber /= 10;
        }
        return binaryNumber;
    }

    public static int toDecimal(long binaryNumber) {
        StringBuilder s = new StringBuilder();
        while (binaryNumber != 0) {
            s.append(binaryNumber % 2);
            binaryNumber /= 2;
        }
        return Integer.parseInt(s.toString());
    }

    public static boolean isSpecialNumber(int n) {
        int sum = 0;
        int original = n;
        while (n != 0) {
            int factorial = 1;
            for (int i = 1; i <= (n % 10); i++)
                factorial *= i;
            sum += factorial;
            n /= 10;
        }
        return sum == original;
    }

    public static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        return rev;
    }

    public static boolean isSuperNumber(int n) {
        int sum = 0;
        int original = n;
        int exp = 1;
        n = Methods.reverseNumber(n);
        while (n > 0) {
            sum += (int) Math.pow((n % 10), exp);
            n = n / 10;
            exp++;
        }
        return sum == original;
    }
}