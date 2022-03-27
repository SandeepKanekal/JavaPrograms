class funarm2 {
    public void arm() {
        for (int i = 1; i <= 1000; i++) {
            int ori = i;
            int sum = 0;
            while (i != 0) {
                int t = i % 10;
                sum += (int) Math.pow(t, 3);
                i /= 10;
            }
            if (sum == ori)
                System.out.println(ori);
            i = ori;
            i++;
        }
    }

    public static void main(String[] args) {
        funarm2 obj = new funarm2();
        obj.arm();
    }
}