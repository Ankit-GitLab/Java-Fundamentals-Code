package ControlStatement_Math_String.Loop.For_Loop;

import java.util.*;

public class PrintCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to print number");

        // Prompt user to enter a number
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();

        // Call method to print numbers from 1 to num
        count(num);
    }

    // Method to print numbers from 1 to num using for loop
    public static void count(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " "); // Print number with space
        }
    }
}
