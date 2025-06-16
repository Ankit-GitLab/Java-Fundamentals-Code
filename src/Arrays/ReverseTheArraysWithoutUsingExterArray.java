package Arrays;

public class ReverseTheArraysWithoutUsingExterArray {
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {12,23,43,23,56,43};
        int n = arr.length;
        System.out.print("Oringinal Array : ");
        print(arr);
        System.out.print("Reverse Array : ");
        int i=0, j = n-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        print(arr);
    }
}

