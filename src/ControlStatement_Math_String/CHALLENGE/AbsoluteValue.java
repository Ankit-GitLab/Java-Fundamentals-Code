package ControlStatement_Math_String.CHALLENGE;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to check the Absolute Value");
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num<0){
            num *= -1;
            System.out.println("Your number is already absolute :  "+num);
        }else{
            System.out.println("Here your number is Absolute : "+num);
        }
    }
}
