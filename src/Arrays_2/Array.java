package Arrays_2;
import Loops.ProductOfGivenDigits;

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int[] marks = new int[size];

        // for input
        System.out.println("Give "+marks.length+" input");
        for(int i=0; i<size; i++){
            marks[i] = sc.nextInt();
        }

        // for print
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
