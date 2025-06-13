package Loops;

import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your digit to calculate the sum : ");
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){
            sum = sum+(num%10);
            num /= 10;
        }
        System.out.print("The given digit sum is : "+sum);
    }

}
