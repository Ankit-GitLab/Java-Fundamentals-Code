package Arrays;
import java.util.Scanner;
public class IsSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array sorting check post");
        int[] numArr = ArrayUtility.inputArray();
        boolean isInc = isDecreasing(numArr);
        boolean isDec = isIncreasing(numArr);
        if(isDec || isInc){
            System.out.println("Your Array is sorted");
        }
        else{
            System.out.println("Your array is not sorted");
        }
    }

    public static boolean isDecreasing(int[] numArr){
        int i = 1;
        while(i<numArr.length){
            if(numArr[i]>numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isIncreasing(int[] numArr){
        int i = 1;
        while(i<numArr.length){
            if(numArr[i]<numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;

    }
}
