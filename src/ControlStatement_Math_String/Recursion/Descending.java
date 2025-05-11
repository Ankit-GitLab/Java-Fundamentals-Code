// Package declaration (based on your folder structure)
package ControlStatement_Math_String.Recursion;

// Importing Scanner class for user input
import java.util.*;

// Class to implement recursion to print numbers in descending order
public class Descending {

    // Recursive method to print numbers from n to 1
    void printDescending(int n) {
        // Base case: stop when n reaches 0
        if (n == 0) {
            return;
        }

        // Print the current number
        System.out.print(n + " ");

        // Recursive call with n - 1
        printDescending(n - 1);
    }

    // Main method: program execution starts here
    public static void main(String[] args) {
        // Display welcome message
        System.out.println("Welcome (🙏) to descending order program using recursion");

        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter n number: ");
        int n = sc.nextInt(); // Read integer input

        // Create an object of Descending class to call the non-static method
        Descending dec = new Descending();

        // Call the recursive method using the object
        dec.printDescending(n);

        // Close the scanner to prevent resource leak
        sc.close();
    }
}
