import java.util.Scanner;

public class FirstNonRepeatingChar {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeating(String text) {
        // There are 256 possible ASCII characters
        int[] charFrequency = new int[256];

        // First loop: store frequency of each character
        for (int i = 0; i < text.length(); i++) {
            charFrequency[text.charAt(i)]++;
        }

        // Second loop: find the first character with a frequency of 1
        for (int i = 0; i < text.length(); i++) {
            if (charFrequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        // Return a placeholder if no non-repeating character is found
        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        char firstNonRepeating = findFirstNonRepeating(userInput);

        if (firstNonRepeating != '\0') {
            System.out.println("The first non-repeating character is: " + firstNonRepeating);
        } else {
            System.out.println("There are no non-repeating characters in the string.");
        }

        scanner.close();
    }
}
