package BasicsOfJava;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        x = sc.nextInt();
        int y = x*x;
        System.out.println("Square of number that you give is : "+y);
        sc.close();
    }
}
