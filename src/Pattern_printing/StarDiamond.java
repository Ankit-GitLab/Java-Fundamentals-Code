package Pattern_printing;
import java.util.Scanner;
public class StarDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print star diamond : ");
        int x = sc.nextInt();
        // upper part
        for(int i=1; i<=x; i++) { // outer loop
            for (int j = 1; j <= x - i; j++) { // for space
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) { // for star
                System.out.print("* ");
            }
            System.out.println();
        }
            // lower part
        for(int i=x-1; i>=1; i--) { // outer loop for reverse
            for (int j=1; j<=x-i; j++) { // for spaces
                System.out.print("  ");
            }
            for (int j =1; j<=2*i-1; j++) { // for stars
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
