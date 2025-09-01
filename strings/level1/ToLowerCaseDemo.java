import java.util.Scanner;

public class ToLowerCaseDemo {

    public static String toLowerCaseCustom(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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

        String lowerCustom = toLowerCaseCustom(text);
        String lowerBuiltIn = text.toLowerCase();

        boolean result = compareStringsCharAt(lowerCustom, lowerBuiltIn);
        System.out.println("Custom Lowercase: " + lowerCustom);
        System.out.println("Built-in Lowercase: " + lowerBuiltIn);
        System.out.println("Are they equal? " + result);
        sc.close();
    }
}
