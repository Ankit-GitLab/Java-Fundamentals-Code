package LOGICAL_QUSTION;
import java.util.*;

class GuessingGame {

    int random;

    // Constructor generates a random number between 1 and 100
    GuessingGame() {
        random = (int)(Math.random() * 100) + 1;
    }

    /**
     * @param guessNumber the number that player guessed
     * @return
     * - Negative if guessed number is smaller than random
     * - 0 if the guessed number is correct
     * - Positive if the guessed number is higher than random
     */
    int guess(int guessNumber) {
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GuessingGame game = new GuessingGame();

        System.out.println("    ❤️‍🩹 Welcome to the Guessing Game 👉");
        System.out.println("🎯 Try to guess the number between 1 and 100\n");

        int guess;
        int result;

        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();
            result = game.guess(guess);

            if (result == 0) {
                System.out.println("🎉 Congrats! Your guess is correct ✌️");
            } else if (result < 0) {
                System.out.println("📈 Try guessing Higher 👆");
            } else {
                System.out.println("📉 Try guessing Lower 👇");
            }
        } while (result != 0);

        sc.close();
    }
}
