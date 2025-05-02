package ControlStatement_Math_String.Loop.For_Loop;
import java.util.*;
public class PrintCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to print number");
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        count(num);

    }

    public static void count(int num){
        for(int i=1; i<=num; i++){
            System.out.print(i+" ");
        }
    }
}
