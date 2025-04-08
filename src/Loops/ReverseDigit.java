package Loops;

import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your digit to calculate the Reverse : ");
        int num = sc.nextInt();
        int Reverse = 0;
        int sum = num;
        while(num != 0){
            Reverse = Reverse * 10;
            Reverse = Reverse+(num % 10);
            num = num / 10;
        }
        int result = sum + Reverse;
        System.out.print("Sum of Num + Resvers is  : " + result);
    }
}
