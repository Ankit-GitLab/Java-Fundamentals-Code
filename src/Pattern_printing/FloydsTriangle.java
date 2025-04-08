package Pattern_printing;
import java.util.Scanner;
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print the floyds number : ");
        int x = sc.nextInt();
        int num = 1;
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num+" ");
                if(num<=10) System.out.print(" ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
