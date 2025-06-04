package Arrays;
import java.util.Scanner; // Import Scanner for input

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create scanner object

        // Ask user for size of array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Check for valid size
        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        int[] arr = new int[n]; // Create array of size n
        int sum = 0; // Variable to store sum

        // Ask user for elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read input
            sum += arr[i];         // Add to sum
        }

        // Print the total sum
        System.out.println("✅ Sum of array elements = " + sum);

        sc.close(); // Close scanner
    }
}
