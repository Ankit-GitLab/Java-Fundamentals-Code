package Loops;
import java.util.Scanner;
public class HelloLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number how many time you want to print Hello : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("😔 Sorry for saying motki ("+i+") time");
        }

        sc.close();
    }
}
