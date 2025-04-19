package Arrays_2D;

import java.util.Scanner;

public class MultiDimensionalAraay {

    static void printArray(int[][] arr){ // row
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){ // column
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                         {1,5,6},
                         {7,9,11},
                         {8,1,1}
                        };
           printArray(arr);
    }

    public static class FindTheArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = {1,3,4,6,8,9,3,34,12,23,1};
            System.out.print("Enter the value which you want to find : ");
            int x = sc.nextInt();
            for(int i=0; i<arr.length; i++){
                if(arr[i]==x){
                    System.out.print("Index Number is : "+arr[i]+" present");
                    break;
                }
                else {
                    System.out.println("not present here");
                    break;
                }
            }
        }
    }
}
