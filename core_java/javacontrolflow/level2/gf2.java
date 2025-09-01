import java.util.Scanner;

public class gf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int greatestFactor = 1;
        int i = 1;
        while (i < number) {
            if (number % i == 0) {
                greatestFactor = i;
            }
            i++;
        }

        System.out.println("Greatest factor (besides itself): " + greatestFactor);
    }
}