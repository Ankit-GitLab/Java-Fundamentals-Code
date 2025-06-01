package Pattern_printing;
import java.util.Scanner;
public class StarRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print star Rhombus : ");
        int x = sc.nextInt();
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x-i; j++){ // for space
                System.out.print("  ");
            }
            for(int j=1; j<=x; j++){ // for star
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
