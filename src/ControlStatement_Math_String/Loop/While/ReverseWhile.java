package ControlStatement_Math_String.Loop.While;

public class ReverseWhile {

    public static void main(String[] args) {
        int number = 12345; // Original number
        int reverse = 0;    // This will store the reversed number

        // While loop to reverse the number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            reverse = reverse * 10 + digit; // Append the digit in reverse
            number = number / 10; // Remove the last digit
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reverse);
    }
}

