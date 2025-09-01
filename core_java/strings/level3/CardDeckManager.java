import java.util.Random;
import java.util.Scanner;

public class CardDeckManager {

    // Method to initialize the deck of cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + rand.nextInt(deck.length - i);
            // Swap current card with a random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
    
    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numPlayers, int numCards) {
        if (numPlayers * numCards > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }
        String[][] playersHands = new String[numPlayers][numCards];
        int cardIndex = 0;
        for (int i = 0; i < numCards; i++) {
            for (int j = 0; j < numPlayers; j++) {
                playersHands[j][i] = deck[cardIndex++];
            }
        }
        return playersHands;
    }
    
    // Method to print the players' hands
    public static void printPlayersHands(String[][] playersHands) {
        if (playersHands == null) return;
        for (int i = 0; i < playersHands.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + "'s cards:");
            for (String card : playersHands[i]) {
                System.out.println("  - " + card);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        
        System.out.print("Enter number of cards to distribute to each player: ");
        int numCards = scanner.nextInt();

        String[][] playersHands = distributeCards(deck, numPlayers, numCards);
        printPlayersHands(playersHands);

        scanner.close();
    }
}
