package Pattern_printing;
import java.util.Scanner;
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter a number columns : ");
        int cols = sc.nextInt();
        System.out.println("To print the Hollow rectangle");
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows; j++){
                if(i==1 || i==cols || j==1 || j==cols)
                   System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
