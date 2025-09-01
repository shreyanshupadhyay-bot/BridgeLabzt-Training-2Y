
import java.util.Scanner;
public class springseason {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the month number (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter the day of the month (1-31): ");
        int day = sc.nextInt();
        if (month >= 3 && month <= 6) {
            if (day >= 1 && day <= 31) {
                System.out.println("It's spring season.");
            } else {
                System.out.println("Invalid day.");
            }
        } else {
            System.out.println("It's not spring season.");
        }
    }
}