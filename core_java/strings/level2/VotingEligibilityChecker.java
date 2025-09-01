import java.util.Random;

public class VotingEligibilityChecker {

    // Generates an array of random 2-digit ages
    public static int[] generateRandomAges(int count) {
        int[] ages = new int[count];
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            ages[i] = 10 + random.nextInt(90); // Generates age between 10 and 99
        }
        return ages;
    }

    // Checks eligibility and returns a 2D array of age and status
    public static String[][] checkEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }
        return results;
    }

    // Displays the 2D array in a tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\n--- Voting Eligibility Status ---");
        System.out.printf("%-10s %s\n", "Age", "Status");
        System.out.println("------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s %s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10;
        int[] ages = generateRandomAges(numberOfStudents);
        String[][] eligibilityStatus = checkEligibility(ages);
        displayTable(eligibilityStatus);
    }
}
