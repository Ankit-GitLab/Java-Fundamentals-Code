package Conditonal;

import java.util.Scanner;
public class SideOfATriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side : ");
        int a = sc.nextInt();
        System.out.print("Enter the second side : ");
        int b = sc.nextInt();
        System.out.print("Enter the third side : ");
        int c = sc.nextInt();
        if((a+b>c) && (a+c>b) && (b+c>a)){
            System.out.println("valid trinagle");
        }
        else{
            System.out.println("invalid trinagle");
        }
        sc.close();
    }
}
