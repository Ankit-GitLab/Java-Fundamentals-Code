package Pattern_printing;
import java.util.Scanner;
public class NumberTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print number Triangle Reverse : ");
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){ // outter loop
            int num = 1;
            for(int j=1; j<=x-i; j++){
                System.out.print("  "); // for space
            }
            for(int k=1; k<=i; k++){
                System.out.print(k+" "); // for number
                num++; // num increament
            }
            System.out.println();
        }
        sc.close();
    }
}
