import java.util.Scanner;

public class CharFrequencyCounter {

    // Method to find the frequency of characters
    public static String[][] findCharacterFrequency(String text) {
        int[] charFrequency = new int[256];
        int uniqueCharCount = 0;

        // Find frequency of each character
        for (int i = 0; i < text.length(); i++) {
            if (charFrequency[text.charAt(i)] == 0) {
                uniqueCharCount++;
            }
            charFrequency[text.charAt(i)]++;
        }

        String[][] result = new String[uniqueCharCount][2];
        int index = 0;
        
        // Store characters and their frequencies
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (charFrequency[c] != 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(charFrequency[c]);
                charFrequency[c] = 0; // Mark as visited
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        String[][] frequencies = findCharacterFrequency(userInput);

        System.out.println("\n--- Character Frequencies ---");
        System.out.printf("%-12s %s\n", "Character", "Frequency");
        System.out.println("-------------------------");
        for (String[] row : frequencies) {
            System.out.printf("%-12s %s\n", row[0], row[1]);
        }
        scanner.close();
    }
}
