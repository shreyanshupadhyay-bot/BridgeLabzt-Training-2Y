import java.util.Scanner;

public class StringLengthWithoutLength {
    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // When charAt throws exception, we know we reached the end
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int lengthCustom = getLength(text);
        int lengthBuiltIn = text.length();

        System.out.println("Length using custom method: " + lengthCustom);
        System.out.println("Length using built-in method: " + lengthBuiltIn);
        sc.close();
    }
}
