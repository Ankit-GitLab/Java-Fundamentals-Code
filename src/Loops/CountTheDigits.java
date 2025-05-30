package Loops;
import java.util.Scanner;
public class CountTheDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count the digit : "); // ---->  123456789
        int num = sc.nextInt();
        int count = 0;
        if(num==0) count++;
        while(num>0){
            num /= 10;
            count++;
        }
        System.out.print("The digit of count is : "+count);// ----> 9
    }
}
