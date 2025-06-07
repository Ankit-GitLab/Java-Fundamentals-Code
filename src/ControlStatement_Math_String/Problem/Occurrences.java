package ControlStatement_Math_String.Problem;

import Arrays.ArrayUtility; // import your utility class
import java.util.*;

public class Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to finding the Occurrences ");

        int[] arr = ArrayUtility.inputArray(); // Get array from utility

        System.out.print("Please enter your number that you want to find: ");
        int search = sc.nextInt();

        int count = countOccurrence(search,arr);

        System.out.println("Your number is present " +count+ " time(s)");

        sc.close();
    }
    public static int countOccurrence(int search, int[] arr){
        int occ = 0;
        for (int num : arr) {
            if (num == search) {
                occ++;
            }
        }
        return occ;
    }

}
