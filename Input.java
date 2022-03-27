import java.util.Scanner;

public class Input {
    final Scanner sc = new Scanner(System.in);

    public boolean acceptBoolean() {
        return sc.nextBoolean();
    }

    public byte accpetByte() {
        return sc.nextByte();
    }

    public short shortValue() {
        return sc.nextShort();
    }

    public int acceptInt() {
        return sc.nextInt();
    }

    public char acceptChar() {
        return sc.next().charAt(0);
    }

    public float acceptFloat() {
        return sc.nextFloat();
    }

    public double acceptDouble() {
        return sc.nextDouble();
    }

    public long acceptLong() {
        return sc.nextLong();
    }

    public String acceptWord() {
        return sc.next();
    }

    public String acceptSentence() {
        return sc.nextLine();
    }
}
