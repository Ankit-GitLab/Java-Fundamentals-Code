package Arrays;

import java.util.Scanner;

public class OcurrenceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.println("Welcome to Array Occurrences\n");

        // Call input method to get 1D array from user
        int[] numArr = ArrayUtility.inputArray();

        // Ask user for number to search
        System.out.print("Now Enter The Number you want to find: ");
        int num = sc.nextInt();

        // Call method to count occurrences
        int occurrence = noOfOccurences(numArr, num);

        // Print the number of times the element was found
        System.out.println("Your element was found " + occurrence + " time(s) in the array.");
    }

    // Method to count how many times 'num' occurs in 'numArr'
    public static int noOfOccurences(int[] numArr, int num) {
        int occ = 0; // Counter for occurrences
        int i = 0;
        while (i < numArr.length) {
            if (numArr[i] == num) {
                occ++; // Increment if match found
            }
            i++;
        }
        return occ; // Return total count
    }
}
