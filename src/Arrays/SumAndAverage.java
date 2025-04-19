package Arrays;
import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        System.out.println("Welcome to Array Sum and Average");

        // Call method to take 1D array input
        int[] numArray = ArrayUtility.inputArray();

        // Calculate sum of elements
        long sum = sum(numArray);

        // Calculate average of elements
        double avg = average(numArray);

        // Print sum and average
        System.out.println("Sum of the number is : " + sum);
        System.out.println("Average of the number is : " + avg);
    }

    // Method to calculate sum of 1D array
    public static long sum(int[] numArray) {
        long sum = 0; // Initialize sum
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i]; // Add each element to sum
            i++;
        }
        return sum; // Return total sum
    }

    // Method to calculate average of 1D array
    public static double average(int[] numArray) {
        long sum = sum(numArray); // Get total sum
        double count = numArray.length; // Get number of elements
        return (sum / count); // Calculate and return average
    }

}
