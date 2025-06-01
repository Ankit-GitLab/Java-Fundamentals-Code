package Pattern_printing;
import java.util.Scanner;
public class Number_0_And_1_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print 0 & 1 triangle : ");
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
