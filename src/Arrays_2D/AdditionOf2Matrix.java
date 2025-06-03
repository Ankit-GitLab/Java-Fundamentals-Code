package Arrays_2D;

import java.util.Scanner;

public class AdditionOf2Matrix {

    static void printMatrix(int[][] arr){
        System.out.println("Sum of matrix 1 and matrix 2");
        for(int i=0; i<arr.length; i++){ // Row
            for(int j=0; j<arr[i].length; j++){ // column
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Wrong Input - Addition not possible");
            return;
        }
        int [][] sum = new int[r1][c1];
        for(int i=0; i<r1; i++){ // row
            for(int j=0; j<c1; j++){ // column
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        printMatrix(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("* Note both matrix are same *");

       // First matrix
        System.out.println("Enter the size of the row or column first matrix");
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
        System.out.println("Enter the size of the row or column second matrix");
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

        add(a,r1,c1,b,r1,c2);
        sc.close();
    }
}
