package Daily_1_Question;
import java.util.Scanner;
class SpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of rows (m) and columns (n)
        System.out.print("Please enter row number: ");
        int m = sc.nextInt();  // Number of rows
        System.out.print("Please enter column number: ");
        int n = sc.nextInt();  // Number of columns

        // Declaring the matrix of size m x n
        int[][] matrix = new int[m][n];

        // Taking input for each element of the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();  // Reading element at position (i,j)
            }
        }

        // Variables to define the boundaries of the spiral
        int top = 0;        // Starting row
        int bottom = m - 1; // Ending row
        int left = 0;       // Starting column
        int right = n - 1;  // Ending column

        // Loop until the spiral is completely printed
        while (top <= bottom && left <= right) {
            // Traverse from left to right (top row)
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;  // Move the top boundary down

            // Traverse from top to bottom (right column)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;  // Move the right boundary left

            // Traverse from right to left (bottom row), if rows remain
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;  // Move the bottom boundary up
            }

            // Traverse from bottom to top (left column), if columns remain
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;  // Move the left boundary right
            }
        }

        sc.close();
    }
}
