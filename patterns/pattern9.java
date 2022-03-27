package patterns;

class pattern9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int m = 1; m <= i; m++)
                System.out.print(m);
            for (int n = 1; n < i; n++)
                System.out.print(n);
            System.out.println();
        }
    }
}