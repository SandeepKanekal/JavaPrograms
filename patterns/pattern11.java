/*
 * 12345
 *  1234
 *   123
 *    12
 *     1
 */
package patterns;

class pattern11 {
    public static void main(String[] args) {
        int c = 5;
        for (int i = 1; i <= 5; i++) {
            for (int m = 1; m < i; m++)
                System.out.print(" ");
            for (int n = 1; n <= c; n++)
                System.out.print(n);
            System.out.println();
            c--;
        }
    }
}