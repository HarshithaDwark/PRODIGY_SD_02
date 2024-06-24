import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int secretNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100 (inclusive)
    int numAttempts = 0;

    System.out.println("I'm thinking of a number between 1 and 100. You have 7 tries to guess it!");

    while (numAttempts < 7) {
      System.out.print("Enter your guess: ");
      int guess = scanner.nextInt();
      numAttempts++;

      if (guess == secretNumber) {
        System.out.println("Congratulations! You guessed the number in " + numAttempts + " tries.");
        break;
      } else if (guess < secretNumber) {
        System.out.println("Your guess is too low. Try again.");
      } else {
        System.out.println("Your guess is too high. Try again.");
      }
    }

    if (numAttempts == 7) {
      System.out.println("Sorry, you ran out of tries. The secret number was " + secretNumber + ".");
    }
  }
}
