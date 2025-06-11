package ControlStatement_Math_String.Problem;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Print welcome message
        System.out.println("    Welcome to multiplication table");

        // Prompt user to enter a number
        System.out.print("Please enter your number : ");
        int num = sc.nextInt(); // Read the number from user

        // Print a message before showing the table
        System.out.println("Multiplication table for " + num + " is");

        // Call the function to print the multiplication table
        printTable(num);

        // Close the Scanner object
        sc.close();
    }

    // Function to print multiplication table of a given number
    public static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            // Print each line of the multiplication table
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
