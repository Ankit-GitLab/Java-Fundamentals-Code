package Pattern_printing;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class StarTriangleHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print star pattern : ");
        int x = sc.nextInt(); // x input
        for(int i=1; i<=x; i++){ // outer loop
            for(int j=1; j<=i-1; j++){ // for space
                System.out.print("  ");
            }
            for(int j=1; j<=x+1-i; j++){ // for star
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
