package Pattern_printing;
import java.util.Scanner;
public class NumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print tringle pattern : ");
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println( );
        }
        sc.close();
    }
}
