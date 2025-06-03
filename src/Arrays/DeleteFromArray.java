package Arrays;
import java.util.Scanner;
public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now, enter the number which you want to deletion : ");
        int numToDelete = sc.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new Array");
        ArrayUtility.displayArray(newArr);

    }
    public static int[] deleteNumber(int[] numArr, int numToDelete){
        int occ = OcurrenceArray.noOfOccurences(numArr, numToDelete);
        if(occ == 0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i=0,j=0;
        while(i<numArr.length){
            if(numArr[i] != numToDelete){
                 newArr[j] = numArr[i];
                 j++;
            }
            i++;
        }
        return newArr;
    }
}
