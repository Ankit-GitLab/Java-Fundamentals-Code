package Arrays;
import java.util.Scanner; // Import Scanner for user input

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        // Ask the user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt(); // Read the size of the array

        int[] arr = new int[n]; // Declare an array of size n

        // Ask the user to input array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Store input values in the array
        }

        int max = arr[0]; // Assume the first element is the largest initially

        // Loop to find the maximum element in the array
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) { // Compare each element with current max
                max = arr[i];   // Update max if a larger value is found
            }
        }

        // Print the largest element
        System.out.println("The largest element in the array is: " + max);

        sc.close(); // Close the scanner object to avoid memory leaks
    }
}
