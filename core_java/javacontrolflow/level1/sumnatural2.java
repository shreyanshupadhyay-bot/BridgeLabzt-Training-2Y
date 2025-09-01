
import java.util.Scanner;

public class sumnatural2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer (natural number).");
            return;
        }

        int sumFormula = n * (n + 1) / 2;

        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }
        
        System.out.println("Sum using formula: " + sumFormula);
        System.out.println("Sum using for loop: " + sumLoop);

        if (sumFormula == sumLoop) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results do not match.");
        }
    }
}