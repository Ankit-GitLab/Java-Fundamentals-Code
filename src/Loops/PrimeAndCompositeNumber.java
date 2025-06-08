package Loops;
import java.util.Scanner;
public class PrimeAndCompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime or composite number : ");
        int n = sc.nextInt();
        int x = 0;
        for(int i=2; i<=n/2; i++){
            if(n%i==0) {
               x = 1;
                break;
            }
        }
        if(n <= 0){
            System.out.println(n+" is neither than prime and composite number");// -7 or 0 ----> then print the lines of code
        }
        else if(x==0){
            System.out.println( n+" is prime number");
        }
        else{
            System.out.println(n+" is composite number");
        }
        sc.close();
    }
}
