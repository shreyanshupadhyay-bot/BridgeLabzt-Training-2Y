import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String s) {
        System.out.println(s.substring(5, 2)); // start > end
    }

    public static void handleException(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        // generateException(str); // Uncomment to see exception
        handleException(str);
        sc.close();
    }
}
