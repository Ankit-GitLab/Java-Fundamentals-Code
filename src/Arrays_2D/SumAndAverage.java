package Arrays_2D;
import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array Sum and Average");
        int[][] numArray = ArrayUtility2D.inputArray();
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("Sum of the number is : "+sum);
        System.out.println("Average of the number is : "+avg);

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
        long sum = sum(numArray);
        double count = 0;

        int i = 0;
        while (i < numArray.length) {
            int j = 0;
            while (j < numArray[i].length) {
                count++; // Count each element
                j++;
            }
            i++;
        }

        return (sum / count); // Proper average
    }

}