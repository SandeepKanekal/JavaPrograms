/*
 * 54321
 *  5432
 *   543
 *    54
 *     5
       */
package patterns;

class pattern12 {
    public static void main(String[] agrs) {
        for (int i = 1; i <= 5; i++) {
            for (int m = 1; m < i; m++)
                System.out.print(" ");
            for (int n = 5; n >= i; n--)
                System.out.print(n);
            System.out.println();
        }
    }
}