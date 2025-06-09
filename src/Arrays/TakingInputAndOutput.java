package Arrays;
import java.util.Scanner;
public class TakingInputAndOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter arr of "+i);
             arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println("Enter arr of "+arr[i]);
        }
        sc.close();
    }
}
