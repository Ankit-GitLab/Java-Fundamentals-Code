package ControlStatement_Math_String.Problem;

import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create Scanner for input

        System.out.println("Welcome to printing Fibonacci Series");
        System.out.print("Please enter number of terms: ");
        int num = sc.nextInt(); // read number of terms

        System.out.print("Your Fibonacci series is: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " "); // print each Fibonacci number
        }

        sc.close(); // close the Scanner
    }

    // Recursive method to return nth Fibonacci number
    public static int fibonacci(int i) {
        if (i == 0 || i == 1) {
            return i; // base cases
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2); // recursive call
        }
    }
}
