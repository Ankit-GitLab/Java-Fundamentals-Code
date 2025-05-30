package Method;
import java.util.Scanner;
public class PascalTriangle {
    public static int fact(int x){
        int xFact = 1;
        for(int i=1; i<=x; i++){
            xFact *= i;
        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter column number : ");
        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            for(int j=0; j<=n-i; j++) {

                System.out.print("  ");
            }

              for(int j=0; j<=i; j++) {

                  int icj = fact(i) / (fact(j) * fact(i - j));
                  System.out.print(icj+"   ");
              }
            System.out.println();
        }
        sc.close();
    }
}
