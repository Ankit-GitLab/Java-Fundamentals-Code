package Arrays;

import javax.swing.*;

public class PassingArrayToMethod {
    // arrays is passed by referrence in method
    public static void change(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

    }
    public static void main(String[] args) {
        int[] arr ={12,23};
        System.out.println("Before Swap --> "+arr[0]+" "+arr[1]);
        change(arr);
        System.out.println("After Swap --> "+arr[0]+" "+arr[1]);

    }
}
