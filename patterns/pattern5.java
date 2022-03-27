/*
 * 1
 * 23
 * 345
 * 4567
 * 56789
 */
package patterns;

class pattern5 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i <= 5; i++) {
            a = i;
            for (int n = 1; n <= i; n++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}