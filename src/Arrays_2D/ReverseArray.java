package Arrays_2D;
import java.util.Scanner;

public class ReverseArray {

    // Method to reverse each row
    static void reverse(int[][] a, int r1, int c1){
        for(int i = 0; i < r1; i++){
            int start = 0;
            int end = c1 - 1;
            while(start < end){
                // Swap elements in the row
                int temp = a[i][start];
                a[i][start] = a[i][end];
                a[i][end] = temp;
                start++;
                end--;
            }
        }

        // Print reversed matrix
        System.out.println("Matrix after reversing each row:");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns of the matrix:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];
        System.out.println("Enter matrix values:");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                a[i][j] = sc.nextInt();
            }
        }

        reverse(a, r1, c1);
        sc.close();
    }
}
