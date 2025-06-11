package Arrays;
import java.util.Scanner;
public class Predict2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the arrays size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println("Enter arr of "+i);
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println("In the arrays there are "+n+" Index");
        System.out.println("The sum of arrays is : "+sum);
    }
}
