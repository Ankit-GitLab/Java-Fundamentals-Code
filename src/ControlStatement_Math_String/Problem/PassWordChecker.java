package ControlStatement_Math_String.Problem;
import java.util.Scanner;
public class PassWordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // For user input
        String password;
        System.out.println("   Welcome to password Checker\n");

        // Set the correct password
        String correctPassword = "1234";

        // Use do-while to keep asking until correct password is entered
        do {
            System.out.print("Enter password: ");
            password = sc.nextLine(); // Get user input

        } while (!password.equals(correctPassword)); // Repeat if password is wrong

        // When loop ends, password is correct
        System.out.println("Password is correct. Access granted!");
    }
}
