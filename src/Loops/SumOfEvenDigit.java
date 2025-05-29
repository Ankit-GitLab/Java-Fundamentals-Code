package Loops;
import java.util.Scanner;
public class SumOfEvenDigit {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your digit to calculate the sum of Even number : ");
            int num = sc.nextInt();
            int sum = 0;
            while (num > 0) {
                int lastDigit = (num % 10);
                if (lastDigit % 2 == 0) {
                    sum += lastDigit;
                }
                num /= 10;
            }
            System.out.print("Give the sum of even number is : " + sum);
    }
}

