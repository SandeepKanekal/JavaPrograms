package patterns;

class pattern2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int m = 1; m < i; m++)
                System.out.print("*");
            System.out.print(i);
            for (int k = 1; k <= (n - i); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}