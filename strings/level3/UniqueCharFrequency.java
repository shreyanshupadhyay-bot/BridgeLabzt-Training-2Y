import java.util.Scanner;

public class UniqueCharFrequency {

    // Method to find unique characters using nested loops
    public static char[] getUniqueCharacters(String text) {
        String uniqueStr = "";
        for (int i = 0; i < text.length(); i++) {
            if (uniqueStr.indexOf(text.charAt(i)) == -1) {
                uniqueStr += text.charAt(i);
            }
        }
        return uniqueStr.toCharArray();
    }

    // Method to find frequency based on unique characters
    public static String[][] findFrequency(String text) {
        char[] uniqueChars = getUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        int[] charFrequency = new int[256];
        for (char c : text.toCharArray()) {
            charFrequency[c]++;
        }

        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            result[i][0] = String.valueOf(c);
            result[i][1] = String.valueOf(charFrequency[c]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        String[][] frequencies = findFrequency(userInput);

        System.out.println("\n--- Character Frequencies (Unique Method) ---");
        System.out.printf("%-12s %s\n", "Character", "Frequency");
        System.out.println("-------------------------------------------");
        for (String[] row : frequencies) {
            System.out.printf("%-12s %s\n", row[0], row[1]);
        }
        scanner.close();
    }
}
