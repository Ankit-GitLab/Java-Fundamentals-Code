package Pattern_printing;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Row : "); // enter number of row ---> 4
        int m = sc.nextInt();
        System.out.print("Enter number of Column : "); // enter number of column ---> 4
        int n = sc.nextInt();
        for(int i=1; i<=m; i++){
            for(int j=1; j<=m; j++){
                System.out.print("* ");
            }
            System.out.println(); // enter
        }
            sc.close();
    }
}
