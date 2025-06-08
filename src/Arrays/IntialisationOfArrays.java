package Arrays;

public class IntialisationOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {12,13,34,54,23}; // this one is arrays declaration with intialisation all show
        arr1[2]=100;
        int[] Ankit = new int[25]; // ways of intialisation the index
        for(int i=0; i<=4; i++){
            System.out.println(arr1[i]);

        }
        int [] arr = new int[7];
        System.out.println(arr[6]);

        arr[6] = 12;
        System.out.println(arr[6]);
    }
}
