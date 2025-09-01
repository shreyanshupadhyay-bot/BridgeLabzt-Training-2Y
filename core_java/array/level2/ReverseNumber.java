import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int[] digits = new int[20]; // initial size
        int index = 0;

        long temp = number;
        while (temp != 0) {
            digits[index++] = (int) (temp % 10);
            temp /= 10;
        }

        System.out.print("Reversed number digits: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        sc.close();
    }
}
