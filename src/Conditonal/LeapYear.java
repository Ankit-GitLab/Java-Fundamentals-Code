import java.util.Scanner; // Import the Scanner class to take input

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        System.out.print("Enter a year: "); // Ask the user to enter a year
        int year = sc.nextInt(); // Read the year from user input

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            // Condition true for leap year: divisible by 4 and not 100 OR divisible by 400
            System.out.println(year + " is a leap year.");
        } else {
            // If above condition is false, then not a leap year
            System.out.println(year + " is not a leap year.");
        }

        sc.close(); // Close the Scanner object
    }
}
