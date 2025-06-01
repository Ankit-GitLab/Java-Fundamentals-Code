package ControlStatement_Math_String.Loop.For_Loop;
import java.util.Scanner;

public class Duplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for size of array
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");

        // Loop to find duplicates
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break;  // Exit inner loop after finding one duplicate
                }
            }
        }

        sc.close();  // Close scanner
    }
}

