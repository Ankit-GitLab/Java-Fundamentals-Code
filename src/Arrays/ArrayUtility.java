package Arrays;
import java.util.Scanner;
public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in); // Create Scanner object for input

        int size;

        // Ask user for the number of elements
        System.out.print("Please enter number of elements: ");
        size = input.nextInt(); // Read size

        // Declare a 1D array with the given size
        int[] array = new int[size];

        // Loop to input each element from the user
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            array[i] = input.nextInt(); // Store user input
        }

        // Display the array
        System.out.println("Your array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // Print each element
        }
        System.out.println(); // Move to next line

        return array; // Return the filled 1D array
    }

}
