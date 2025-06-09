package Pattern_printing;
import java.util.Scanner;
public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter only odd number to print star plus : "); // 1,3,5.. take only odd
        int x = sc.nextInt();
        int midNum = (x/2)+1;
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x; j++){
                if(i==midNum || j==midNum)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
