package Pattern_printing;
import java.util.Scanner;
public class StarTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print Star triangle Reverse : ");
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){ // outter loop
            for(int j=1; j<=x; j++) { // inner loop
                if((i+j)<=x)
                  System.out.print("  "); // for space
                else
                    System.out.print("* "); // for star
            }
            System.out.println();
        }
        sc.close();
    }
}
