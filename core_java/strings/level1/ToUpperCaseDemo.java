import java.util.Scanner;

public class ToUpperCaseDemo {

    public static String toUpperCaseCustom(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareStringsCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String upperCustom = toUpperCaseCustom(text);
        String upperBuiltIn = text.toUpperCase();

        boolean result = compareStringsCharAt(upperCustom, upperBuiltIn);
        System.out.println("Custom Uppercase: " + upperCustom);
        System.out.println("Built-in Uppercase: " + upperBuiltIn);
        System.out.println("Are they equal? " + result);
        sc.close();
    }
}
