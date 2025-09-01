import java.util.Scanner;

public class BMICalculator {

    // Method to compute BMI and determine status
    public static String[] computeBMIAndStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // Convert cm to meters
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 10.0) / 10.0; // Round to one decimal place

        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{String.valueOf(heightCm), String.valueOf(weight), String.valueOf(bmi), status};
    }

    // Method to process all persons and return a 2D array for display
    public static String[][] processAllPersons(double[][] measurements) {
        String[][] results = new String[measurements.length][4];
        for (int i = 0; i < measurements.length; i++) {
            results[i] = computeBMIAndStatus(measurements[i][0], measurements[i][1]);
        }
        return results;
    }

    // Method to display the results in a tabular format
    public static void displayBMIResults(String[][] results) {
        System.out.println("\n-------------------- BMI Results --------------------");
        System.out.printf("%-15s %-15s %-10s %-15s\n", "Height (cm)", "Weight (kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------");
        for (String[] personData : results) {
            System.out.printf("%-15s %-15s %-10s %-15s\n", personData[0], personData[1], personData[2], personData[3]);
        }
        System.out.println("-----------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teamSize = 10;
        double[][] measurements = new double[teamSize][2];

        System.out.println("Enter weight (kg) and height (cm) for " + teamSize + " persons:");
        for (int i = 0; i < teamSize; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            measurements[i][0] = scanner.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            measurements[i][1] = scanner.nextDouble();
        }

        String[][] bmiResults = processAllPersons(measurements);
        displayBMIResults(bmiResults);

        scanner.close();
    }
}
