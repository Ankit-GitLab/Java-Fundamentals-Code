package Conditonal;
import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check Divisible by 5 or not : ");
        int num = sc.nextInt();
        if(num%5==0){
            System.out.println(num+" is Divisible by 5 ");
        }
        else{
            System.out.println(num+" is not Divisible by 5");
        }
        sc.close();
    }
}
