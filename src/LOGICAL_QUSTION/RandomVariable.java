package LOGICAL_QUSTION;
import java.util.Scanner;
public class RandomVariable {
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The code is generate the random variable");
        System.out.print("Enter First Number : ");
        int min = sc.nextInt();
        System.out.print("Enetr Second Number : ");
        int max = sc.nextInt();
        System.out.print("Random value of between "+min+" to "+max+" : ");
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}
