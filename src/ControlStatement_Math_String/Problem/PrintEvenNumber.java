package ControlStatement_Math_String.Problem;
import java.util.*;
import Arrays.ArrayUtility; // import your utility class
public class PrintEvenNumber {
    public static void main(String[] args) {
        System.out.println("Welcome to print of even number");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Your Even number is : ");
        for(int num : arr){
            if(num % 2 != 0){
                continue;
            }
            System.out.print(num+" ");
        }
    }
}
