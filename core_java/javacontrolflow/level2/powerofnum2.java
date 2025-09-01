import java.util.Scanner;

public class powerofnum2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer (number): ");
        int number = scanner.nextInt();

        System.out.print("Enter a positive integer (power): ");
        int power = scanner.nextInt();
        
        int result = 1;
        int i = 1;
        while (i <= power) {
            result *= number;
            i++;
        }

        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}