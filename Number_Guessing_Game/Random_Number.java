// This is a simple number guessing game where the user has to guess a randomly generated number within a limited number of attempts.

import java.util.Random;
import java.util.Scanner;

public class Random_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random(); // initialize random number generator

        int maxAttempts = 7;
        int maxNumber = 100;
        int score = 100;

        String playAgain;

        do {
            System.out.println("--- Welcome to Number Guessing Game ---");
            System.out.println("Select Difficulty Level:");
            System.out.println("1. Easy (1-50, 7 attempts)");
            System.out.println("2. Medium (1-100, 6 attempts)");
            System.out.println("3. Hard (1-200, 5 attempts)");
            System.out.print("Enter your choice (1-3): ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    maxNumber = 50;
                    maxAttempts = 7;
                    break;
                case 2:
                    maxNumber = 100;
                    maxAttempts = 6;
                    break;
                case 3:
                    maxNumber = 200;
                    maxAttempts = 5;
                    break;
                default:
                    System.out.println("Invalid choice! Defaulting to Medium level.");
            }

            int numToGuess = rand.nextInt(maxNumber) + 1; // generate random number between 1 and maxNumber

            int tries = 0;
            int Userguess = 0;

            System.out.println("Guess a number between 1 and " + maxNumber + ":");

            while ((Userguess != numToGuess) && (tries < maxAttempts)) {
                System.out.println("Enter your guess: ");
                Userguess = sc.nextInt();
                tries++;

                if (Userguess > numToGuess) {
                    System.out.println("Too high! Try again.");
                    score -= 10;
                } else if (Userguess < numToGuess) {
                    System.out.println("Too low! Try again.");
                    score -= 10;
                } else {
                    System.out.println(
                            "Congratulations! You've guessed the number " + numToGuess + " in " + tries + " tries.");
                }

                // Final result
                if (Userguess == numToGuess) {
                    System.out.println("✅ Attempts Used: " + tries);
                    System.out.println("🏆 Your Score: " + score);
                } else {
                    System.out.println("\n❌ Game Over!");
                    System.out.println("The correct number was: " + numToGuess);
                    System.out.println("🏆 Your Score: " + score);
                }

                if (tries == maxAttempts && Userguess != numToGuess) {
                    System.out.println("Sorry, you've used all your attempts. The number was: " + numToGuess);
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        sc.close();
    }
}
