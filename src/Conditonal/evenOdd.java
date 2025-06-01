package Conditonal;
import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check Even or odd number : ");
      int num = sc.nextInt();
      if(num%2==0){
          System.out.println(num+" is Even Number");
      }
      else{
          System.out.println(num+" is Odd Number");
      }
      sc.close();
    }
}
