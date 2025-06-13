package Loops;
import java.util.Scanner;
public class GP_multipal_2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int p = 1;
        for(int i=1; i<=n; i++){
            System.out.print(p+" "); // 1,2,4,8,16,32....n
            p *= 2;
        }
        sc.close();
    }
}
