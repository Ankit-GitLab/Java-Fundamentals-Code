package Arrays;
import java.util.Scanner;
public class MaximumInArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of index : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter index number "+i+" : ");
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("the maximum number of the index : "+max);
        sc.close();
    }
}
