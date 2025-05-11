package ControlStatement_Math_String.Recursion;
import java.util.*;

// Java program to print numbers from n to 1 using recursion
public class Descending {

    // Recursive method
    static void printDescending(int n) {
        // Base case: if n is 0, stop recursion
        if (n == 0) {
            return;
        }

        // Print current number
        System.out.print(n+" ");

        // Recursive call with n-1
        printDescending(n - 1);
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome to descending order program using recursion");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number: ");
        int n = sc.nextInt(); // You can change this number
        printDescending(n); // Call the recursive function
    }
}

