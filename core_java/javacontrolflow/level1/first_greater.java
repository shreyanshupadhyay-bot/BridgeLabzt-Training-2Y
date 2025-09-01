
import java.util.Scanner;

public class first_greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        String smallest = (num1 < num2) && (num1 < num3) ? "yes" : "no";
        System.out.println("Is the first number the smallest? " + smallest);
    }
    
}