package Arrays;

public class LengthOperator {
    public static void main(String[] args) {
        int[] arr = {12,34,25,65,87,65,43,24,65,9,76};
        System.out.println("The length of arr is : "+arr.length);
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
