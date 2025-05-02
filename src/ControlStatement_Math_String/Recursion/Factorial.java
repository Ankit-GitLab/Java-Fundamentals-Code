package ControlStatement_Math_String.Recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to factorial generator");

        // Asking user to enter a number
        System.out.print("Please Enter your number : ");
        int n = sc.nextInt(); // Taking input and storing in variable 'n'

        // Calling the recursive factorial function and storing the result
        long fact = factorial(n);

        // Displaying the result
        System.out.println("Factorial of " + n + " is : " + fact);
    }

    // Recursive function to calculate factorial
    public static long factorial(int num) {
        // Base case: factorial of 0 or 1 is 1
        if (num == 0 || num == 1) {
            return 1;
        }

        // Recursive case: num * factorial of (num - 1)
        return num * factorial(num - 1);
    }
}
