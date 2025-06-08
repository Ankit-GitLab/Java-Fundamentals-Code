package Daily_1_Question;

import java.util.Scanner;

class SecondLargest {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create array of size n
        int[] arr = new int[n];

        // Take array input from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize the largest and second largest to minimum value
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // Loop through the array to find the largest and second largest
        for (int i = 0; i < n; i++) {
            // If current element is greater than first
            if (arr[i] > first) {
                second = first;  // Update second largest
                first = arr[i];  // Update largest
            }
            // If current element is less than first but greater than second
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];  // Update second largest
            }
        }

        // Check if second largest was found
        if (second == Integer.MIN_VALUE) {
            System.out.println("Second largest number not found (all elements may be equal).");
        } else {
            System.out.println("Second largest number is: " + second);
        }

        // Close the scanner
        sc.close();
    }
}

