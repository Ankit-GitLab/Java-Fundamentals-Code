package ControlStatement_Math_String.Problem;

import Arrays.ArrayUtility;

public class MaxArray {
    public static void main(String[] args) {
        System.out.println("Welcome to finding the maximum");
        int[] arr = ArrayUtility.inputArray();

        int max = arr[0];
        for(int num: arr){
            if(max<num){
                max = num;
            }
        }
        System.out.println("Maximum number is: "+max);
    }
}
