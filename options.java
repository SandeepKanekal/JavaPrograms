import java.util.Scanner;

class options {
       public static void main(String[] args) {
              int a = 0;
              int b = 0;
              Scanner sc = new Scanner(System.in);
              System.out.println(
                            "1.ADDS 2 NUMBERS \n2.SUBTRACTS 2 NUMBERS \n3.MULTIPLIES 2 NUMBERS \n4.DIVIDES 2 NUMBERS");
              int n = sc.nextInt();
           switch (n) {
               case 1 -> {
                   System.out.println("ENTER A NUMBER");
                   a = sc.nextInt();
                   System.out.println("ENTER A NUMBER");
                   b = sc.nextInt();
                   int sum = a + b;
                   System.out.println("SUM = " + sum);
               }
               case 2 -> {
                   System.out.println("ENTER A NUMBER");
                   a = sc.nextInt();
                   System.out.println("ENTER A NUMBER");
                   b = sc.nextInt();
                   int dif = a - b;
                   System.out.println("DIFFERENCE = " + dif);
               }
               case 3 -> {
                   System.out.println("ENTER A NUMBER");
                   a = sc.nextInt();
                   System.out.println("ENTER A NUMBER");
                   b = sc.nextInt();
                   int pro = a * b;
                   System.out.println("PRODUCT = " + pro);
               }
               case 4 -> {
                   System.out.println("ENTER A NUMBER");
                   a = sc.nextInt();
                   System.out.println("ENTER A NUMBER");
                   b = sc.nextInt();
                   if (b == 0)
                       System.out.println("DIVISION BY 0 IS IMPOSSIBLE");
                   double quo = a / b;
                   System.out.println("QUOTIENT = " + quo);
               }
               default -> System.out.println("INVALID INPUT");
           }
              sc.close();
       }
}