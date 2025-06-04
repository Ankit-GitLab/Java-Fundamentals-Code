package Conditonal;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to convert absolute value : ");
        int num = sc.nextInt();
        if(num<0){
          num *= (-1);
        }
        System.out.println("The absolute value is "+num); // -7 --> 7
        sc.close();
    }
}
