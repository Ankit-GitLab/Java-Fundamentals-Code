package ControlStatement_Math_String.Problem;

import java.util.*;

public class PrimeOrNot {

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Print welcome message
        System.out.println("Welcome to prime number checker");

        // Prompt user to enter a number
        System.out.print("Please enter your number : ");
        int num = sc.nextInt(); // Read the number

        // Call the function and store result
        boolean isPrime = isPrime(num);

        // Print result using ternary operator
        System.out.println("Your number is " + (isPrime ? "Prime" : "Not Prime"));

        // Close Scanner
        sc.close();
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // 0 and 1 are not prime numbers
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to num / 2
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, not prime
            }
        }

        return true; // If no divisor found, it's prime
    }
}
