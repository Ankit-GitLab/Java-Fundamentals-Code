package Pattern_printing;
import java.util.Scanner;
public class AlphabetTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print Alphabet Triangle Reverse : ");
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print((char)(k+64)+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
