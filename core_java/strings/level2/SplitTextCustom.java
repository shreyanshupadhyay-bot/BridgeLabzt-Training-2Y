import java.util.Scanner;

public class SplitTextCustom {
    
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return count;
    }

    public static String[] splitWordsCustom(String text) {
        int len = getLength(text);
        int wordCount = 1; // Minimum 1 word
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;
        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String[] customWords = splitWordsCustom(text);
        String[] builtInWords = text.split(" ");

        boolean result = compareStringArrays(customWords, builtInWords);
        System.out.println("Custom split: ");
        for (String w : customWords) System.out.println(w);
        System.out.println("Built-in split: ");
        for (String w : builtInWords) System.out.println(w);

        System.out.println("Are both arrays equal? " + result);
        sc.close();
    }
}
