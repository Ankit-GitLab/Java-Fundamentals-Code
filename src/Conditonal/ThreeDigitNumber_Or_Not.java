package Conditonal;
import java.util.Scanner;
public class ThreeDigitNumber_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter only positive number to check Three Digit_Or_Not : ");
        int number = sc.nextInt();
        if((number>99) && (number<1000)){
            System.out.println(+number+" is yes three Digit number");
        }
        else {
            System.out.println(number+" is not Three Digit number");
        }
        sc.close();
    }
}
