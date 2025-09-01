import java.util.Scanner;

public class CharTypeDisplayer {

    // Re-using getCharType from the previous example
    public static String getCharType(char c) {
        // ... (implementation from VowelConsonantCounter)
        if (c >= 'A' && c <= 'Z') c = (char) (c + 32);
        if (c >= 'a' && c <= 'z') {
            return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? "Vowel" : "Consonant";
        }
        return "Not a Letter";
    }

    // Creates a 2D array of characters and their types
    public static String[][] getCharTypesArray(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = getCharType(c);
        }
        return result;
    }

    // Displays the 2D array in a tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\n--- Character Analysis ---");
        System.out.printf("%-12s %s\n", "Character", "Type");
        System.out.println("--------------------------");
        for (String[] row : data) {
            System.out.printf("%-12s %s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        String[][] charTypes = getCharTypesArray(userInput);
        displayTable(charTypes);

        scanner.close();
    }
}
