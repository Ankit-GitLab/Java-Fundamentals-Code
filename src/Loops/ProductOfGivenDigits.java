package Loops;
import java.util.Scanner;
public class ProductOfGivenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate the product : ");
        int num = sc.nextInt();
        int product = 1;
        while(num>0){
            int lastDigit= num%10;
            if (lastDigit != 0) {
                product *= lastDigit;
            }
            num /= 10;
        }
        System.out.print("The product of given input is : "+product);
        sc.close();
    }
}
