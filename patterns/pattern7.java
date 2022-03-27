package patterns;

class pattern7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int m = 1; m <= i; m++)
                System.out.print(i);
            System.out.println();
        }
    }
}