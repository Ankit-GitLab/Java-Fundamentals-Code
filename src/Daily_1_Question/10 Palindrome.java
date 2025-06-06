package Daily_1_Question;
import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome (🙏) to Palindrome checker program");

        // Ask the user to enter an integer
        System.out.print("please enter an integer: ");
        int number = sc.nextInt();

        // Store the original number in a temporary variable for comparison
        int originalNumber = number;

        // Variable to store the reversed number
        int reversedNumber = 0;

        // Use a while loop to reverse the number
        while (number != 0) {
            int digit = number % 10;                // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Append digit to reversed number
            number = number / 10;                   // Remove the last digit from number
        }

        // Check if the original number and reversed number are the same
        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a Palindrome.");
        } else {
            System.out.println(originalNumber + " is Not a Palindrome.");
        }

        // Close the scanner to prevent memory leak
        sc.close();
    }

}
