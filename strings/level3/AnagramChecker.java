import java.util.Scanner;

public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Normalize strings: remove spaces and convert to lowercase
        String s1 = text1.replaceAll("\\s", "").toLowerCase();
        String s2 = text2.replaceAll("\\s", "").toLowerCase();

        // Anagrams must have the same length
        if (s1.length() != s2.length()) {
            return false;
        }

        // Create frequency arrays for both strings
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Populate frequency arrays
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i)]++;
            freq2[s2.charAt(i)]++;
        }

        // Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        scanner.close();
    }
}
