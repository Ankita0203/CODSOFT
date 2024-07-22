//#TASK1





import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            boolean numberGuessed = false;
            int numberOfPlayers;
            int[] playerScores;
            
            System.out.print("Enter the number of players: ");
            numberOfPlayers = scanner.nextInt();
            playerScores = new int[numberOfPlayers];
            while (!numberGuessed) {
                for (int i = 0; i < numberOfPlayers; i++) {
                    System.out.print("Player " + (i + 1) + ", enter your guess: ");
                    int playerGuess = scanner.nextInt();
                    playerScores[i]++;

                    if (playerGuess > numberToGuess) {
                        System.out.println("Too high!");
                    } else if (playerGuess < numberToGuess) {
                        System.out.println("Too low!");
                    } else {
                        System.out.println("Player " + (i + 1) + " guessed the correct number!");
                        System.out.println("It took Player " + (i + 1) + " " + playerScores[i] + " guesses.");
                        numberGuessed = true;
                        break;
                    }
                }
            }
            
            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}
