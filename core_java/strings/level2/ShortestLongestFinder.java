import java.util.Scanner;

public class ShortestLongestFinder {

    // Methods splitTextIntoWords, findLength, and getWordsWithLengths are reused
    // from previous examples.

    public static String[] findShortestAndLongest(String[][] wordsAndLengths) {
        if (wordsAndLengths == null || wordsAndLengths.length == 0) {
            return new String[]{"", ""};
        }

        String shortestWord = wordsAndLengths[0][0];
        String longestWord = wordsAndLengths[0][0];
        int minLength = Integer.parseInt(wordsAndLengths[0][1]);
        int maxLength = Integer.parseInt(wordsAndLengths[0][1]);

        for (int i = 1; i < wordsAndLengths.length; i++) {
            int currentLength = Integer.parseInt(wordsAndLengths[i][1]);
            if (currentLength < minLength) {
                minLength = currentLength;
                shortestWord = wordsAndLengths[i][0];
            }
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestWord = wordsAndLengths[i][0];
            }
        }
        return new String[]{shortestWord, longestWord};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        String[] words = WordAndLengthArray.splitTextIntoWords(userInput);
        String[][] wordsAndLengths = WordAndLengthArray.getWordsWithLengths(words);
        String[] result = findShortestAndLongest(wordsAndLengths);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
        
        scanner.close();
    }
}
