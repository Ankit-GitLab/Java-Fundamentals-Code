package ControlStatement_Math_String.CHALLENGE;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to check the Absolute Value");
        System.out.print("Please Enter your number : ");
        int num = sc.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.println("Absolute number is "+result);
    }
}
