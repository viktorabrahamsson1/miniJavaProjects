import java.util.Scanner;

import models.Guess;

public class App {
  public static void main(String[] args) throws Exception {
    Guess guess = new Guess();
    Scanner scanner = new Scanner(System.in);

    boolean gameStatus = true;
    int amountOfGuesses = 1;

    while (gameStatus) {
      System.out.println("Guess a number between 1-100: ");
      int userGuess = scanner.nextInt();
      String sentance = userGuess > guess.computorRandom ? "to high, try again!" : "to low, try again";

      if (userGuess == guess.computorRandom) {
        gameStatus = false;
        scanner.close();
        System.out.println("You guessed correct, with the score of: " + amountOfGuesses + "!");
      } else {
        System.out.println("you guessed " + sentance);
        amountOfGuesses++;
      }
    }
  }
}
