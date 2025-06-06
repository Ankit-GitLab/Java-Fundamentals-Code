package Arrays;
import java.util.Scanner;

public class MaximumAndMinimum {

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to find the Maximum and Minimum:");

        // Take input from user using custom method
        int[] numArr = ArrayUtility.inputArray();

        // Find maximum value
        int max = maximum(numArr);
        System.out.println("Your maximum number in this array is: " + max);

        // Find minimum value
        int min = minimum(numArr);
        System.out.println("Your minimum number in this array is: " + min);
    }

    // Method to find maximum number in an array
    public static int maximum(int[] numArr) {
        int max = numArr[0]; // Assume first element is max
        int i = 1; // Start from second element
        while (i < numArr.length) {
            if (numArr[i] > max) {
                max = numArr[i]; // Update max if current element is greater
            }
            i++;
        }
        return max;
    }

    // Method to find minimum number in an array
    public static int minimum(int[] numArr) {
        int min = numArr[0]; // Assume first element is min
        int i = 1; // Start from second element
        while (i < numArr.length) {
            if (numArr[i] < min) {
                min = numArr[i]; // Update min if current element is smaller
            }
            i++;
        }
        return min;
    }
}
