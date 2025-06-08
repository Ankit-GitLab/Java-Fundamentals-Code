package Loops;
import java.util.Scanner;
public class ContinueStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.print("Hello Ankit ");
                continue;
            }
            System.out.println(i+" ");
        }
        sc.close();
    }
}
