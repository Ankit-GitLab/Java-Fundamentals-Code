package Loops;
import java.util.Scanner;
public class PrintNumberN_To_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            System.out.print(i+" ");//10,9,8,7,6,5,4,3,2,1
        }
    }
}
