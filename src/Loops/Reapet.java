package Loops;

import java.util.Scanner;

public class Reapet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your age : ");
        int age = sc.nextInt();
        while(age < 0 || age > 100){
            System.out.print("Please Enter your age : ");
            age = sc.nextInt();
        }
        System.out.println("Your age is : "+age);
        sc.close();
    }
}
