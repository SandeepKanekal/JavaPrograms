/*
 * to display:
 *  abc
 *  abc
 *  abc
 */
class series1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            char ch = 'a';
            for (int m = 1; m <= 3; m++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}