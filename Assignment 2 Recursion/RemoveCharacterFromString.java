import java.util.Scanner;

public class RemoveCharacterFromString {

    static String remove(String s, char c, int index) {
        if (index == s.length()) {
            return "";
        }

        char current = s.charAt(index);
        String rest = remove(s, c, index + 1);

        if (current == c) {
            return rest;
        }

        return current + rest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char c = sc.nextLine().charAt(0);

        System.out.println(remove(s, c, 0));

        sc.close();
    }
}
