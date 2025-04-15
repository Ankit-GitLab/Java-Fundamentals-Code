package Arrays_2D;

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
}
