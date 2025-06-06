package Arrays;
import java.util.Scanner;
public class GreaterThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter index number "+i+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter a number to check greater than of X : ");
        int x = sc.nextInt();
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(x<arr[i]){
                count++;
            }

        }
        System.out.print(count+" number is greater than "+x);

    }
}
