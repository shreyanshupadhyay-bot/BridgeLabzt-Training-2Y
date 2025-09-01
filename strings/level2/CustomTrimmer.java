import java.util.Scanner;

public class CustomTrimmer {

    // Finds the start and end indices of the non-space content
    public static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;

        // Find the first non-space character from the beginning
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the first non-space character from the end
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Creates a substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    
    // Compares two strings using charAt()
    public static boolean areStringsEqual(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading/trailing spaces: ");
        String userInput = scanner.nextLine();

        // Custom trim logic
        int[] indices = findTrimIndices(userInput);
        String customTrimmed = customSubstring(userInput, indices[0], indices[1]);

        // Built-in trim for comparison
        String builtinTrimmed = userInput.trim();

        System.out.println("Custom trimmed result: '" + customTrimmed + "'");
        System.out.println("Built-in trim() result: '" + builtinTrimmed + "'");

        boolean areEqual = areStringsEqual(customTrimmed, builtinTrimmed);
        System.out.println("Are the results identical? " + areEqual);

        scanner.close();
    }
}
