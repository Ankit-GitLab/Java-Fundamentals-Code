package Conditonal;
import java.util.Scanner;
public class GreaterThanThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int number1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int number2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int number3 = sc.nextInt();
        if(number1>number2 && number1>number3){
            System.out.println("number1 is greater than number2 and number3");
        }
        else if(number2>number1 && number2>number3){
            System.out.println("number2 is greater than number1 and number3");
        }
        else{
            System.out.println("number3 is greater than number2 and number1");
        }
        sc.close();
    }
}
