import java.util.Scanner;

public class Multiplication6to9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] result = new int[10];

        for (int multiplier = 6; multiplier <= 9; multiplier++) {
            System.out.println("Multiplication Table for " + multiplier + ":");
            for (int i = 1; i <= 10; i++) {
                result[i - 1] = multiplier * i;
                System.out.println(multiplier + " * " + i + " = " + result[i - 1]);
            }
            System.out.println();
        }

        sc.close();
    }
}
