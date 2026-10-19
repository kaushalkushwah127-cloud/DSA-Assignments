import java.util.Scanner;

public class BinaryToDecimal {

    static long convert(String s, int index) {
        if (index == s.length()) {
            return 0;
        }

        int digit = s.charAt(index) - '0';

        return digit * power(2, s.length() - 1 - index)
                + convert(s, index + 1);
    }

    static long power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }

        return base * power(base, exp - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(convert(s, 0));

        sc.close();
    }
}
