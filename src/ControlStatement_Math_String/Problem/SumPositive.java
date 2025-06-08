package ControlStatement_Math_String.Problem;

import java.util.*;
import Arrays.ArrayUtility; // import your utility class

public class SumPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for user input

        System.out.println("Welcome to adding positive number");

        int[] arr = ArrayUtility.inputArray(); // pass Scanner to inputArray method

        int sum = 0; // initialize sum to 0

        // loop through the array to add only positive numbers
        for (int num : arr) {
            if (num < 0) {
                continue; // skip negative numbers
            }
            sum += num; // add positive number to sum
        }

        System.out.println("Sum of positive number is : " + sum); // display the result

        sc.close(); // close the Scanner
    }
}
