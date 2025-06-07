package ControlStatement_Math_String.Recursion;
import java.util.Scanner;

public class PowerCal {

    int power(int a, int b) {
        if (b == 0) return 1;
        return a * power(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        int a = sc.nextInt();

        System.out.print("Enter power: ");
        int b = sc.nextInt();

        PowerCal pc = new PowerCal();
        int p = pc.power(a, b);

        System.out.println(a + " raised to the power " + b + " is: " + p);

        sc.close();
    }
}

