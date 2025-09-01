
import java.util.Scanner;

public class sumofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        boolean condition =true;
        int sum = 0;
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("The sum of numbers is 0");
        }else{
            while (condition) {
                System.out.print("Again enter a number: ");
                int num2 = sc.nextInt();
                if (num2 != 0) {
                    sum += num2;
                }else{
                    condition = false;
                }
            }
            System.out.println("The sum of numbers is: " + sum);
        }
    }
}