/*
 * ****11****
 * ***2222***
 * **333333**
 * *44444444*
 * 5555555555
 * 5555555555
 * *44444444*
 * **333333**
 * ***2222***
 * ****11****
 */
package patterns;

class pattern13 {
    public static void main(String[] args) {
        int l = 5;
        for (int i = 1; i <= 5; i++) {
            for (int s = 1; s < l; s++)
                System.out.print("*");
            for (int n = 1; n <= i; n++) {
                System.out.print(i);
                System.out.print(i);
            }
            for (int s = 1; s < l; s++)
                System.out.print("*");
            System.out.println();
            l--;
        }
        l = 5;
        for (int i = 1; i <= 5; i++) {
            for (int s = 1; s < i; s++)
                System.out.print("*");
            for (int n = 1; n <= l; n++) {
                System.out.print(l);
                System.out.print(l);
            }
            for (int s = 1; s < i; s++)
                System.out.print("*");
            System.out.println();
            l--;
        }
    }
}