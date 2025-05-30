package Pattern_printing;
import java.util.Scanner;
public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print the ASCII value Give the input : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
