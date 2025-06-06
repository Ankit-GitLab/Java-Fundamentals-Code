package Daily_1_Question;
import java.util.Scanner;
class Fibonacci1 {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter the number of terms
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = sc.nextInt();  // Store user input

        // Declare first two terms of the series
        int first = 0, second = 1;

        // Print the Fibonacci series up to n terms
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 1; i <= n; i++) {
            // Print current term
            System.out.print(first + " ");

            // Calculate next term
            int next = first + second;

            // Update previous terms for next iteration
            first = second;
            second = next;
        }

        // Close the scanner
        sc.close();
    }
}
