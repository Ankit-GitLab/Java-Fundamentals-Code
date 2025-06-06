package Arrays_2D;
import java.util.Scanner;
public class TransposeWithoutUsingArray {

    // print matrix
    static void printMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    //find transpose without using exter array
    static void TransposeInPlace(int[][] matrix, int r, int c){
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
                // swap matrix[i][j], matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row and column of matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElement = r*c;
        System.out.println("Enter "+totalElement+" values");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);


        System.out.println("Transpose matrix");
        TransposeInPlace(matrix,r,c);
        printMatrix(matrix);
    }
}
