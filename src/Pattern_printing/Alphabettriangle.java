package Pattern_printing;
import java.util.Scanner;
public class Alphabettriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print alphabet triangle : ");
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
