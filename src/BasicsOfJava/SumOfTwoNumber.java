package BasicsOfJava;
import java.util.Scanner;
public class SumOfTwoNumber {
    public static void main(String[] args) {
        int first,second;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        first = sc.nextInt();
        System.out.print("Enter second number : ");
        second = sc.nextInt();
        int sum = first + second;
        System.out.println("The sum of given input is : "+sum);
        sc.close();
    }
}
