package Arrays;
import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid size.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0]; // Assume first is smallest

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i]; // Update min
            }
        }

        System.out.println("✅ Smallest element is: " + min);
        sc.close();
    }
}
