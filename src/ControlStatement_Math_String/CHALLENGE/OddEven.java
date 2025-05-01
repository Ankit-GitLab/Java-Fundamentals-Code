package ControlStatement_Math_String.CHALLENGE;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for input

        System.out.println("Welcome Finding Odd and Even");
        System.out.print("Please enter your number: ");
        int num = sc.nextInt(); // Read number

        OddEven obj = new OddEven(); // Create object
        String result = obj.oddEven(num); // Call method

        System.out.println("The number is: " + result); // Display result
        sc.close(); // Close scanner
    }

    // Method to return "Odd" or "Even"
    public String oddEven(int num) {
        String result = (num % 2 == 0) ? "Even" : "Odd"; // Ternary to check even/odd
        return result; // Return result
    }
}
