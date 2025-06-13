package Pattern_printing;
import java.util.Scanner;
public class NumberTriangleUlta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print number triangle ulta : ");
        int x = sc.nextInt();
        for(int i=x; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
