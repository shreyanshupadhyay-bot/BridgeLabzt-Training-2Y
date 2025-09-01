import java.util.Random;
import java.util.Scanner;

public class StudentGradeCalculator {

    // Generates random 2-digit scores for PCM
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        Random random = new Random();
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + random.nextInt(90); // Physics
            scores[i][1] = 10 + random.nextInt(90); // Chemistry
            scores[i][2] = 10 + random.nextInt(90); // Math
        }
        return scores;
    }

    // Calculates total, average, and percentage
    public static double[][] calculateMetrics(int[][] scores) {
        double[][] metrics = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double percentage = (total / 300.0) * 100.0;
            
            metrics[i][0] = total;
            metrics[i][1] = Math.round((total / 3.0) * 100.0) / 100.0; // Average
            metrics[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage
        }
        return metrics;
    }
    
    // Calculates grade based on percentage
    public static String[] calculateGrades(double[][] metrics) {
        String[] grades = new String[metrics.length];
        for (int i = 0; i < metrics.length; i++) {
            double percentage = metrics[i][2];
            if (percentage >= 80) grades[i] = "A";
            else if (percentage >= 70) grades[i] = "B";
            else if (percentage >= 60) grades[i] = "C";
            else if (percentage >= 50) grades[i] = "D";
            else if (percentage >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // Displays the final scorecard
    public static void displayScorecard(int[][] scores, double[][] metrics, String[] grades) {
        System.out.println("\n--- Student Scorecard ---");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-10s %s\n", 
            "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println(new String(new char[95]).replace('\0', '-'));

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10s %-10d %-10d %-10d %-10.0f %-10.2f %-11.2f%% %s\n",
                "Student " + (i + 1), scores[i][0], scores[i][1], scores[i][2],
                metrics[i][0], metrics[i][1], metrics[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] metrics = calculateMetrics(scores);
        String[] grades = calculateGrades(metrics);
        
        displayScorecard(scores, metrics, grades);
        scanner.close();
    }
}
