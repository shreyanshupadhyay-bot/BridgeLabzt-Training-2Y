import java.util.Scanner;

public class UniqueCharacterFinder {

    // Method to find string length without using length()
    public static int findLength(String s) {
        int count = 0;
        try {
            for (count = 0; ; count++) {
                s.charAt(count);
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Loop terminates when exception is caught
        }
        return count;
    }

    // Method to find unique characters using nested loops
    public static char[] findUniqueCharacters(String text) {
        int len = findLength(text);
        char[] uniqueCharsTemp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            // Inner loop checks if the character has appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCharsTemp[uniqueCount++] = currentChar;
            }
        }

        // Create a new array with the exact size of unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueCharsTemp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        char[] uniqueChars = findUniqueCharacters(userInput);

        System.out.print("Unique characters in the string are: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        scanner.close();
    }
}
