package ControlStatement_Math_String.Problem;

import java.util.*;
import Arrays.ArrayUtility; // import your utility class

public class PrintEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create Scanner object

        System.out.println("Welcome to print of even number");

        int[] arr = ArrayUtility.inputArray(); // call inputArray with Scanner

        System.out.print("Your Even numbers are: ");
        for (int num : arr) {
            if (num % 2 != 0) {
                continue; // skip odd numbers
            }
            System.out.print(num + " "); // print even number
        }

        sc.close(); // close Scanner
    }
}
