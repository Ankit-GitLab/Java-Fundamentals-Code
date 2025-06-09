package ControlStatement_Math_String.Recursion;
import java.util.*;
// Class to solve the Staircase Problem using recursion
public class Stair {

    // Recursive method to count ways to climb n stairs
    int countWays(int n) {
        // Base case: if n is 0 or 1, only one way to reach
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case: sum of ways from (n-1) and (n-2) steps
        return countWays(n - 1) + countWays(n - 2);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user to enter number of stairs
        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        // Create object to call the non-static method
        Stair s = new Stair();

        // Call the recursive method and print result
        int ways = s.countWays(n);
        System.out.println("Number of ways to climb " + n + " stairs = " + ways);

        // Close scanner
        sc.close();
    }
}

