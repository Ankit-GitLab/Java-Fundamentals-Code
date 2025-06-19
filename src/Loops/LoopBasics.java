package Loops;

import java.util.Scanner;

public class LoopBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number how many time you want to print Ankit kumar : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("mere moto cute hai "+i+" 💕 ");
        }
        System.out.println();
        sc.close();

    }
}
