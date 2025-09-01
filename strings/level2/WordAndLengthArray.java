import java.util.Scanner;

public class import java.util.Scanner;

public class WordAndLengthArray {

    // Re-using the custom split method from the previous example
    public static String[] splitTextIntoWords(String text) {
        // ... (implementation from CustomStringSplitter)
        if (text == null || text.isEmpty()) return new String[0];
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) if (text.charAt(i) == ' ') wordCount++;
        String[] words = new String[wordCount];
        StringBuilder currentWord = new StringBuilder();
        int wordIndex = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = currentWord.toString();
                currentWord = new StringBuilder();
            } else {
                currentWord.append(text.charAt(i));
            }
        }
        words[wordIndex] = currentWord.toString();
        return words;
    }

    // Re-using the custom length method from the first example
    public static int findLength(String str) {
        // ... (implementation from StringLengthFinder)
        int i = 0;
        try { for (i = 0; ; i++) str.charAt(i); } catch (Exception e) {}
        return i;
    }

    // Creates a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        String[] words = splitTextIntoWords(userInput);
        String[][] wordsAndLengths = getWordsWithLengths(words);

        System.out.println("\n--- Words and Their Lengths ---");
        System.out.printf("%-20s %s\n", "Word", "Length");
        System.out.println("-------------------------");

        for (String[] row : wordsAndLengths) {
            String word = row[0];
            int length = Integer.parseInt(row[1]); // Convert back to int for display
            System.out.printf("%-20s %d\n", word, length);
        }

        scanner.close();
    }
}
 {

    // Re-using the custom split method from the previous example
    public static String[] splitTextIntoWords(String text) {
        // ... (implementation from CustomStringSplitter)
        if (text == null || text.isEmpty()) return new String[0];
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) if (text.charAt(i) == ' ') wordCount++;
        String[] words = new String[wordCount];
        StringBuilder currentWord = new StringBuilder();
        int wordIndex = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = currentWord.toString();
                currentWord = new StringBuilder();
            } else {
                currentWord.append(text.charAt(i));
            }
        }
        words[wordIndex] = currentWord.toString();
        return words;
    }

    // Re-using the custom length method from the first example
    public static int findLength(String str) {
        // ... (implementation from StringLengthFinder)
        int i = 0;
        try { for (i = 0; ; i++) str.charAt(i); } catch (Exception e) {}
        return i;
    }

    // Creates a 2D array of words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        String[] words = splitTextIntoWords(userInput);
        String[][] wordsAndLengths = getWordsWithLengths(words);

        System.out.println("\n--- Words and Their Lengths ---");
        System.out.printf("%-20s %s\n", "Word", "Length");
        System.out.println("-------------------------");

        for (String[] row : wordsAndLengths) {
            String word = row[0];
            int length = Integer.parseInt(row[1]); // Convert back to int for display
            System.out.printf("%-20s %d\n", word, length);
        }

        scanner.close();
    }
}
