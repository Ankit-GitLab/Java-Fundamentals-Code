package Conditonal;
import java.util.Scanner;
public class DivisibleBy_3_and_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Take positive integer to check divisiable by 3 and 5 : ");
        int number = sc.nextInt();
        if(number%3==0 && number%5==0){
            System.out.println(number+" is divisible by 3 and 5");
        }
        else {
            System.out.println(number+" is not divisible by 3 and 5");
        }
        sc.close();
    }
}
