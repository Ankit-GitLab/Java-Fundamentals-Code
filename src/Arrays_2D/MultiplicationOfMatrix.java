package Arrays_2D;

import java.util.Scanner;

public class MultiplicationOfMatrix {

        //printMatrix
    static void printMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++){ // Row
            for(int j=0; j<arr[i].length; j++){ // column
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

    static void multi(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1 != r2){
            System.out.println("Wrong Input - Multiplication not possible");
            return;
        }
        int [][] mul = new int[r1][c2]; // ✅ Correct size
        for(int i=0; i<r1; i++){ // row
            for(int j=0; j<c2; j++){ // column
                for(int k=0; k<c1; k++){ // multiply and add
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }

        System.out.println("multiplication of matrix 1 and matrix 2");
        printMatrix(mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // first matrix
        System.out.println("Enter number of  row and columns first matrix");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter matrix values ");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                a[i][j] = sc.nextInt();
            }
        }

        // Second matrix
        System.out.println("Enter number of  row and columns second matrix");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];
        System.out.println("Enter matrix values ");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1");
        printMatrix(a);
        System.out.println("Matrix 2");
        printMatrix(b);

        multi(a,r1,c1,b,r2,c2);
        sc.close();
    }
}
