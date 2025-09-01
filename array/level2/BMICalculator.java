import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Enter weight of person " + (i + 1) + ": ");
                weight[i] = sc.nextDouble();
            } while (weight[i] <= 0);

            do {
                System.out.print("Enter height of person " + (i + 1) + " in meters: ");
                height[i] = sc.nextDouble();
            } while (height[i] <= 0);

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) status[i] = "Underweight";
            else if (bmi[i] <= 24.9) status[i] = "Normal";
            else if (bmi[i] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + "\t" + weight[i] + "\t" + bmi[i] + "\t" + status[i]);
        }

        sc.close();
    }
}
