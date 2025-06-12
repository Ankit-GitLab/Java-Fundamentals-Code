package Conditonal;
import java.util.Scanner;
public class DivisiableBy5AndNot3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Take positive integer to check Divisiable  by 3 and 5 : ");
        int number = sc.nextInt();
        if(number%3!=0 && number%5==0) System.out.println(number + " is divisible by 5 and not divisiable by 3");
        else {
            System.out.println(number+" invalid number");
        }
        sc.close();
    }
}
