package Arrays;
import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int even = 0, odd = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("✅ Even numbers: " + even);
        System.out.println("✅ Odd numbers: " + odd);

        sc.close();
    }
}
