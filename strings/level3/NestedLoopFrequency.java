import java.util.Scanner;

public class NestedLoopFrequency {

    public static void findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1; // Initialize frequency
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    // Mark duplicate character as '0' to avoid recounting
                    chars[j] = '0';
                }
            }
        }

        System.out.println("\n--- Character Frequencies (Nested Loop) ---");
        System.out.printf("%-12s %s\n", "Character", "Frequency");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < freq.length; i++) {
            if (chars[i] != ' ' && chars[i] != '0') {
                System.out.printf("%-12s %d\n", chars[i], freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
        findFrequency(userInput);
        scanner.close();
    }
}
