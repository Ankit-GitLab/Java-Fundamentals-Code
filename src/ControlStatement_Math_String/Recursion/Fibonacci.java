package ControlStatement_Math_String.Recursion;

import java.util.Scanner;

public class Fibonacci {

    int fibo(int n) {
        if (n <= 2) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome (🙏) to fibonacci number program");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Fibonacci f = new Fibonacci();
        System.out.println("Fibonacci number at position " + n + " is " + f.fibo(n));

        sc.close();
    }
}
