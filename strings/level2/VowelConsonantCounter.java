import java.util.Scanner;

public class VowelConsonantCounter {

    // Checks if a character is a vowel, consonant, or neither
    public static String getCharType(char c) {
        // Convert to lowercase if it's an uppercase letter
        if (c >= 'A' && c <= 'Z') {
            c = (char) (c + 32);
        }

        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Counts vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < text.length(); i++) {
            String type = getCharType(text.charAt(i));
            if (type.equals("Vowel")) {
                vowelCount++;
            } else if (type.equals("Consonant")) {
                consonantCount++;
            }
        }
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        int[] counts = countVowelsAndConsonants(userInput);

        System.out.println("Total Vowels: " + counts[0]);
        System.out.println("Total Consonants: " + counts[1]);

        scanner.close();
    }
}
