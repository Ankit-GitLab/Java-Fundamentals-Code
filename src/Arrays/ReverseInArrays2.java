package Arrays;

public class ReverseInArrays2 {
    public static void main(String[] args) {
        int[] arr = {1, 2,3,4,5,6 ,4, 5, 6};
        int n = arr.length;
        System.out.print("Original Arrays : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Reverse Arrays : ");

        for(int i=n-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}

