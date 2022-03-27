package patterns;

class pattern10 {
    public static void main(String[] args) {
        int l = 5;
        int sum = 0;
        for (int i = 1; i <= l; i++) {
            sum = 0;
            for (int m = 1; m <= i; m++) {
                System.out.print(m);
                sum += m;
            }
            for (int n = 1; n < l; n++)
                System.out.print(" ");
            System.out.print(sum);
            System.out.println();
        }
    }
}