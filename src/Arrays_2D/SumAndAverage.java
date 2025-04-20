package Arrays_2D;

import Arrays.ArrayUtility;

public class SumAndAverage {
    public static void main(String[] args) {

        System.out.println("Welcome to sum and Average of 2D  Array");
        int[][] numArray = ArrayUtility.input2DArray();
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("Your sum of array is : "+sum);
        System.out.println("Your average of array is : "+avg);

    }

    public static long sum(int[][] numArray){
        long sum =0;
        int i = 0;
        while(i< numArray.length){
            int j = 0;
            while(j< numArray[i].length){
                sum += numArray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double average(int[][] numArray) {
        if(numArray.length == 0){
            return 0;
        }
        int row = numArray.length;
        int cols = numArray[0].length;
        double size = row*cols;
        return sum(numArray)/size;
    }

}