package ControlStatement_Math_String.CHALLENGE;
import java.util.*;
public class Minimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to check minimum");
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number : ");
        int num2 = sc.nextInt();
        int result = Math.min(num1,num2);
        System.out.println(result+" is the minimum Number ");
    }
}
