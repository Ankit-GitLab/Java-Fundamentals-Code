package Loops;

import java.util.Scanner;

public class FactorialOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial is : ");
        int num = sc.nextInt();
        int fact =1;
        for(int i=1; i<=num; i++){
            fact *= i;
            System.out.println("The Factorial "+i+" is :"+fact);
        }
        sc.close();
    }
}
