package Loops;

import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your digit to calculate the Reverse : ");
        int num = sc.nextInt();
        int reverse = 0;
        int sum = num;
        while(num != 0){
            reverse = reverse * 10;
            reverse = reverse+(num % 10);
            num = num / 10;
        }
        int result = sum + reverse;
        System.out.println("Reverse number is: "+reverse);
        System.out.print("Sum of Num + Reverse is  : " + result);
    }
}
