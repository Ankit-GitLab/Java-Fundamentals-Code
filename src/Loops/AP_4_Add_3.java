package Loops;
import java.util.Scanner;
public class AP_4_Add_3 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter a number to want to AP number 4 to n : ");
        int n = sc.nextInt();
        for(int i=4; i<=3*n+1; i+=3) {
            System.out.print(i + " "); // 4,7,10,13
        }
        sc.close();
    }
}
