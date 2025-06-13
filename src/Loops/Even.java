package Loops;
import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter a number to want to even number 2 to n : ");
        int n = sc.nextInt();
        for(int i=2; i<=n; i+=2) {
            System.out.print(i + " ");//2,4,6,8,10.....n
        }
        sc.close();
    }
}
