import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateException(String s) {
        System.out.println(s.charAt(s.length())); // Invalid index
    }

    public static void handleException(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
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
