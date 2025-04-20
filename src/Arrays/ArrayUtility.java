package Arrays;
import java.util.Scanner;
public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in); // Create Scanner object for input


        System.out.print("Please enter the number of elements: ");
        int size;
        size = input.nextInt();
        int[] array = new int[size];

        // Loop to input each element from the user
        int i = 0;
        while(i<size){
            System.out.print("Enter element at index " + (i+1) + ": ");
            array[i] = input.nextInt();
            i++;
        }
       // Display the array using a while loop
        System.out.println("Your array is:");
        int j = 0; // Initialize index for display loop
        while (j < array.length) {
            System.out.print(array[j] + " "); // Print each element
            j++; // Move to next index
        }
        System.out.println(); // Move to next line

        return array; // Return the filled 1D array
    }

    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);

        int rows, columns;

        System.out.print("Please enter number of rows : ");
        rows = input.nextInt();

        System.out.print("Please enter number of columns : ");
        columns = input.nextInt();

        int[][] numArray = new int[rows][columns];

        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                numArray[i][j] = input.nextInt();
            }
        }

        System.out.println("\nYour matrix is below:");
        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                System.out.print(numArray[i][j] + " ");
            }
            System.out.println();
        }
        return numArray;

    }

    public static void displayArray(int[] numArray){
        int i = 0;
        while(i < numArray.length){
            System.out.print(numArray[i]+" ");
           i++;
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        sc.close();
    }

}
