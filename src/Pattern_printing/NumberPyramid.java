package Pattern_printing;
import java.util.Scanner;
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print number pryamid : ");
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){ // outter loop
            for(int j=1; j<=x-i; j++){ // for space
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){ // for number
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
