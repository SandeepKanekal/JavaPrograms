import java.util.*;

class nerd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("DO U LIKE STUDYING-ANSWER WITH 'TRUE' OR 'FALSE'");
        boolean x = sc.nextBoolean();
        if (x)
            System.out.println(
                    "YOU ARE A NERD\nIF YOU ARE SHIVADHATHAN (AKA NERDDHATHAN), YOU WILL NEVER EVER BE COOL IN YOUR ENTIRE LIFE");
        else
            System.out.println(
                    "YOU ARE COOL\nIF YOU ARE A MEMBER OF CMB ???, YOU COULD NEVER EVER BE A NERD(SHIVADHATHAN)");
        sc.close();
    }
}