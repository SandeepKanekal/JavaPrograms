class nested_loop {
    public static void main(String[] args) {
        First:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; true; j++) {
                if (j == 2)
                    continue First;
                System.out.print(j + "\n");
            }
        }
    }
}