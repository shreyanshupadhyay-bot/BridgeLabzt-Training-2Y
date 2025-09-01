import java.util.Scanner;

public class allmultiplies2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();
        System.out.println("Multiples of " + number + " below 100:");
        int i = 100;
        while (i >= 1) {
            if (i % number == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
