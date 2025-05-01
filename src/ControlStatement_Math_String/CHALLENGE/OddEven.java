package ControlStatement_Math_String.CHALLENGE;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to check the Odd and Even");
        System.out.print("Enter number to check odd or Even : ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is Even");
        }else{
            System.out.println(num+" is Odd");
        }
    }
}
