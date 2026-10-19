import java.util.Scanner;

public class ReplaceCharacterInString {

    static String replace(String s, char c1, char c2, int index) {
        if (index == s.length()) {
            return "";
        }

        char current = s.charAt(index);

        if (current == c1) {
            current = c2;
        }

        return current + replace(s, c1, c2, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);

        System.out.println(replace(s, c1, c2, 0));

        sc.close();
    }
}
