package ControlStatement_Math_String.Loop.For_Loop;
import java.util.Scanner;

public class PrimeNumber {

    // Method to check if a number is prime
    static boolean isPrime(int num) {
        if (num < 2) {
            return false;  // 0 and 1 are not prime
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;  // If divisible, it's not prime
            }
        }
        return true;  // It's a prime number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take input

        // Ask user for input
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println("Prime numbers from 1 to " + n + " are:");

        // Loop from 1 to n and print primes
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");  // Print the prime number
            }
        }

        System.out.println();  // Newline after output
        sc.close();  // Close the scanner
    }
}

