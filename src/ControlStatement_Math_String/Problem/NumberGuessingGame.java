package ControlStatement_Math_String.Problem;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create a Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Set the correct number to guess
        int num = 50;  // You can also make this random for more fun
        int guess;    // Variable to store user's guess

        // Welcome message
        System.out.println("   Welcome to number guessing game\n");

        // Repeat until the correct number is guessed
        do {
            // Prompt user to guess a number
            System.out.print("Please guess the number between 1 and 10 : ");
            guess = sc.nextInt(); // Read user input

            // Optionally give hint if wrong
            if (guess < num) {
                System.out.println("Too low! Try again.\n");
            } else if (guess > num) {
                System.out.println("Too high! Try again.\n");
            }

        } while (num != guess); // Loop continues until correct guess

        // Congratulate user
        System.out.println("You have successfully guessed the number!");

        // Close Scanner object
        sc.close();
    }
}
