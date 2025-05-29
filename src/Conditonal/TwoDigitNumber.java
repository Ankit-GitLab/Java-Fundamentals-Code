package Conditonal;
import java.util.Scanner;
public class TwoDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check the two digit number : ");
        int number = sc.nextInt();
        if((number>9) && (number<100)){
            System.out.println(+number+" is yes two Digit number");
        }
        else {
            System.out.println(+number+" is not two digit number");
        }
        sc.close();
    }
}
