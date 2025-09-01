import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    // Gets the computer's choice randomly
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(choices.length)];
    }

    // Determines the winner of a single round
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Tie";
        }
        switch (userChoice) {
            case "Rock":
                return (computerChoice.equals("Scissors")) ? "User" : "Computer";
            case "Paper":
                return (computerChoice.equals("Rock")) ? "User" : "Computer";
            case "Scissors":
                return (computerChoice.equals("Paper")) ? "User" : "Computer";
        }
        return "Invalid"; // Should not happen with valid input
    }
    
    // Displays round results and final statistics
    public static void displayResults(String userChoice, String computerChoice, String winner) {
        System.out.println("User chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);
        if (winner.equals("Tie")) {
            System.out.println("Result: It's a Tie!");
        } else {
            System.out.println("Result: " + winner + " wins!");
        }
        System.out.println("--------------------");
    }

    public static void displayFinalStats(int userWins, int computerWins, int totalGames) {
        double userWinPercentage = (totalGames > 0) ? ((double) userWins / totalGames) * 100 : 0;
        double computerWinPercentage = (totalGames > 0) ? ((double) computerWins / totalGames) * 100 : 0;
        
        System.out.println("\n--- Final Game Statistics ---");
        System.out.printf("%-10s %-10s %-15s\n", "Player", "Wins", "Win Percentage");
        System.out.println("-----------------------------------");
        System.out.printf("%-10s %-10d %.2f%%\n", "User", userWins, userWinPercentage);
        System.out.printf("%-10s %-10d %.2f%%\n", "Computer", computerWins, computerWinPercentage);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many games would you like to play? ");
        int numGames = scanner.nextInt();

        int userWins = 0;
        int computerWins = 0;

        for (int i = 1; i <= numGames; i++) {
            System.out.println("\n--- Game " + i + " ---");
            System.out.print("Enter your choice (Rock, Paper, or Scissors): ");
            String userChoice = scanner.next();
            
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);
            
            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) computerWins++;
            
            displayResults(userChoice, computerChoice, winner);
        }
        
        displayFinalStats(userWins, computerWins, numGames);
        scanner.close();
    }
}
