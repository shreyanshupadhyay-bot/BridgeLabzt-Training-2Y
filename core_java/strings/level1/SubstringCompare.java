import java.util.Scanner;

public class SubstringCompare {
    public static String substringCharAt(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
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
        System.out.print("Enter the string: ");
        String str = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String subCustom = substringCharAt(str, start, end);
        String subBuiltIn = str.substring(start, end);

        boolean result = compareStringsCharAt(subCustom, subBuiltIn);
        System.out.println("Custom substring: " + subCustom);
        System.out.println("Built-in substring: " + subBuiltIn);
        System.out.println("Are they equal? " + result);
        sc.close();
    }
}
