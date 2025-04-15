package Arrays_2D;
import java.util.Scanner;
public class TakingInputFromUser {

    static void printArray(int[][] arr){

        for(int i=0; i<arr.length; i++){ // Row
            for(int j=0; j<arr[i].length; j++){ // column
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row or column");

        System.out.print("Enter Row number : ");
        int r = sc.nextInt();

        System.out.print("Enter Column number : ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c]; // total Element = r*c

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print("Enter row "+i+" column "+j+" : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix of ("+r+","+c+")");
        printArray(arr);
    }
}
