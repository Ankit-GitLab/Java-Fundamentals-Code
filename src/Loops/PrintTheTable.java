package Loops;
import java.util.Scanner;
public class PrintTheTable {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number which you want to table : ");
        int x = sc.nextInt();
        for(int i=x; i<=x*10; i+=x){
             System.out.println(i);
        }
        sc.close();
    }
}
