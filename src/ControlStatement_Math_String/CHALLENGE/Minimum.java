package ControlStatement_Math_String.CHALLENGE;
import java.util.*;

public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to finding minimum");
        System.out.print("Please enter your first number: ");
        int num1 = sc.nextInt();

        System.out.print("Now, please enter your second number: ");
        int num2 = sc.nextInt();

        Minimum ternary = new Minimum(); // Create object
        int min = ternary.min(num1, num2); // Call min method

        System.out.println("Your minimum number is: " + min);

        sc.close(); //  Close the scanner
    }

    // Method to find minimum using ternary operator
    public int min(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
    }
}
