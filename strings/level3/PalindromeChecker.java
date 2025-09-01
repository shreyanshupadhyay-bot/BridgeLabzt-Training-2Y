import java.util.Arrays;
import java.util.Scanner;

public class PalindromeChecker {

    // Logic 1: Iterative two-pointer method
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        // Base case: if there is only one or zero characters left
        if (start >= end) {
            return true;
        }
        // If characters at start and end do not match
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        // Recursive call for the substring
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using character arrays (reverse and compare)
    public static boolean isPalindromeWithReverse(String text) {
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            reverseArray[i] = originalArray[originalArray.length - 1 - i];
        }

        return Arrays.equals(originalArray, reverseArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String userInput = scanner.nextLine().toLowerCase(); // Case-insensitive check

        // Check using Logic 1
        boolean result1 = isPalindromeIterative(userInput);
        System.out.println("1. Iterative Method: Is it a palindrome? " + result1);

        // Check using Logic 2
        boolean result2 = isPalindromeRecursive(userInput, 0, userInput.length() - 1);
        System.out.println("2. Recursive Method: Is it a palindrome? " + result2);

        // Check using Logic 3
        boolean result3 = isPalindromeWithReverse(userInput);
        System.out.println("3. Reverse Array Method: Is it a palindrome? " + result3);

        scanner.close();
    }
}
