// This Java applications is provided without data, only
// sufficient code to illustrate the points made in
// chapter 3.

import java.util.Random;
import java.util.Scanner;

public class GuessingGameEfficient  {
    public static void main(String[] args) {
        int secretNumber = generateSecretNumber();
        int userrGess;

        do {
            userrGess = getUserGuess();
            if(userrGess != secretNumber) {
                System.err.println("Try again");
            }
        } while (userrGess != secretNumber);

        System.err.println("You Guessed the secret number:" + secretNumber);
    }

    private static int generateSecretNumber() {
        Random random= new Random();
        return random.nextInt(100) + 1;
    }

    private static int getUserGuess() {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter your guess: ");
            return scanner.nextInt();
        }
    }
}
