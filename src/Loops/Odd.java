package Loops;
import java.util.Scanner;
public class Odd {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter a number to want to odd number 1 to n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i+=2) {
            System.out.print(i + " ");//1,3,5,7,9,11...n
        }
        sc.close();
    }
}
