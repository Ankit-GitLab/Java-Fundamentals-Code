package Arrays_2D; // Package declaration

import java.util.Scanner; // Import Scanner for user input

public class ArrayUtility {

    // Method to input a 2D array from the user
    public static int[][] inputArray() {
        Scanner input = new Scanner(System.in); // Create Scanner object for input

        int row, columns;

        // Ask user for number of rows
        System.out.print("Please enter number of rows: ");
        row = input.nextInt();

        // Ask user for number of columns
        System.out.print("Please enter number of columns: ");
        columns = input.nextInt();

        // Declare a 2D array with user-defined size
        int[][] array = new int[row][columns];

        // Loop to input elements from user
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                array[i][j] = input.nextInt(); // Store user input
            }
        }

        // Display the array in matrix format
        System.out.println("Your matrix is below:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " "); // Print each element
            }
            System.out.println(); // Move to next line after each row
        }

        return array; // Return the filled array
    }
}
