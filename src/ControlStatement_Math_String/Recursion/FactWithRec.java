package ControlStatement_Math_String.Recursion;
import java.util.Scanner;

public class FactWithRec {




    int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        int num = sc.nextInt();

        FactWithRec f = new FactWithRec();
        int result = f.factorial(num);
        System.out.println("Factorial of " + num + " is " + result);

        sc.close();
    }
}

