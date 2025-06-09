package Pattern_printing;
import java.util.Scanner;
public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 4;
        int n = 4;
        System.out.println("The number square is below");
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
