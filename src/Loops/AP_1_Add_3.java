package Loops;
import java.util.Scanner;
public class AP_1_Add_3 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter a number to want to AP number 1 to n : ");
        int n = sc.nextInt();
        for(int i=1; i<=n*2-1; i+=2) {
            System.out.print(i + " "); // 1,3,5,7,9,11
        }
        sc.close();
    }
}
