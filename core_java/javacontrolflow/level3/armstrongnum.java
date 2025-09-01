import java.util.Scanner;

public class armstrongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int n = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;  
            sum += Math.pow(digit, n); 
            number /= 10;              
        }


        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is NOT an Armstrong number.");
        }
    }
}