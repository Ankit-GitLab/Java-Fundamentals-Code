package Pattern_printing;
import java.util.Scanner;
public class StarTriangleReverse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print star triangle Reverse : ");
        int x = sc.nextInt(); // taking input
        for(int i=1; i<=x; i++){ // outter loop
            for(int j=1; j<=x-i; j++) { // for space
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++) { // for star
                 System.out.print("* ");
            }

            System.out.println();
        }
        sc.close();
    }
}
