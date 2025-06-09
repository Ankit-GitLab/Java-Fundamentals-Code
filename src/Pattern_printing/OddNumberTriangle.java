package Pattern_printing;
import java.util.Scanner;
public class OddNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print odd number triangle : ");
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){
            int a = 1;
            for(int j=1; j<=i; j++){
                    System.out.print(a+" ");
                    a+=2;
            }
            System.out.println();
        }
        sc.close();
    }
}
