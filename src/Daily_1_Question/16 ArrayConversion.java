package Daily_1_Question;
import java.util.Scanner;
class ArrayConversion {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask for the size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Declare the array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Convert even to 0 and odd to 1
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 0; // Even → 0
            } else {
                arr[i] = 1; // Odd → 1
            }
        }

        // Print the updated array
        System.out.println("Modified array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close(); // Close the Scanner
    }
}
