/*
135
357
579
*/
package patterns;

class pattern6 {
    public static void main(String[] args) {
        int a = 1;
        for (int g = 1; g <= 3; g++) {
            for (int n = 1; n <= 3; n++) {
                System.out.print(a);
                a += 2;
            }
            a -= 4;
            System.out.println();
        }
    }
}