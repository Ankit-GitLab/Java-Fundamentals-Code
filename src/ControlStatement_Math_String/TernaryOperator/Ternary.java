package ControlStatement_Math_String.TernaryOperator;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Ternary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to number checker");
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int var = (num1>num2) ? num1 : num2;

        System.out.println(var+" is the greater number ");
    }
}
