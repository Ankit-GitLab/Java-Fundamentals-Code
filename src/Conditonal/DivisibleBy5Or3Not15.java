package Conditonal;
import java.util.Scanner;
public class DivisibleBy5Or3Not15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check divisible by 3 or 5 but not 15 : ");
        int num = sc.nextInt();
        if((num%5==0) || (num%3==0)){
            if(num%15!=0){
                System.out.println(num+" is a divisible by 5 or 3 but not 15");
            }
            else{
                System.out.println(num+" is a divisible by 15");
            }
        }
        else{
            System.out.println(num+" is not a divisible by 5 or 3");
        }
        sc.close();
    }
}
