package Method;
import java.util.Scanner;

public class SwapTwoNumber {
    public static void swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap --> "+a+"  "+b);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        System.out.print("Enter b number : ");
        int b = sc.nextInt();
        System.out.println("Before Swap --> "+a+"  "+b);
        swap(a,b);
        System.out.println("Before Swap --> "+a+"  "+b);

        sc.close();

    }
}
