import java.util.Scanner;

class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String s = sc.next();
        int l = s.length();
        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);
            System.out.println(ch);
        }
        sc.close();
    }
}