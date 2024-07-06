import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberGuess = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Guess a number between 1 and 100:");

        while (!hasGuessedCorrectly) {
            int userGuess = sc.nextInt();
            numberOfTries++;

            if (userGuess == numberGuess) {
                hasGuessedCorrectly = true;
                System.out.println("Correct! You've guessed the number in " + numberOfTries + " tries.");
            } else if (userGuess < numberGuess) {
                System.out.println("Too low, try again:");
            } else {
                System.out.println("Too high, try again:");
            }
        }

        sc.close();
    }
}
