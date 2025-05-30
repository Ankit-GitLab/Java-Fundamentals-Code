package Method;
import java.util.Scanner;

public class CombinationAndPermutation{
    public static int fact(int x){
        int xFact = 1;
        for(int i=1; i<=x; i++){
            xFact *= i;
        }
        return xFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n number : ");
        int n = sc.nextInt();
        System.out.print("Enter r number : ");
        int r = sc.nextInt();
        int nFact = fact(n);
        int rFact = fact(r);
        int n_rFact = fact(n-r);

        int ncr = nFact/(rFact*n_rFact);
        int npr = nFact/n_rFact;
        System.out.println("nCr : "+ncr);
        System.out.println("nPr : "+npr);

    }
}
