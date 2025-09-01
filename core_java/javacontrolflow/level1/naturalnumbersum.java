
import java.util.Scanner;

public class naturalnumbersum{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();
        if (num >1){
            int sum =  num *(num +1)/2;
            System.out.println("The sum of first " + num + " natural numbers is: " + sum);
        }else {
            System.out.println("The number " + num + " is not a natural number");
        }
    }
}
