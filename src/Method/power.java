package Method;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base : ");
        double a = sc.nextDouble();
        System.out.print("Enter power : ");
        double b = sc.nextDouble();
        System.out.print("Power is : "+Math.pow(a,b));
        System.out.println();
        sc.close();
    }
}










