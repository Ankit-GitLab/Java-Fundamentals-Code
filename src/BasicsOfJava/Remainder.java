package BasicsOfJava;
import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend : ");
        int a = sc.nextInt();
        System.out.print("Enter divisor : ");
        int b = sc.nextInt();
        int q = a / b;
        int remainder = a - (b * q);
        System.out.println("the remainder when "+a+" is divided by "+b+" is : "+remainder);
        sc.close(); 
    }
}
