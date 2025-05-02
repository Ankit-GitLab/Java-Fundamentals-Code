package ControlStatement_Math_String.Loop_Do_While;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your age : ");
        int age = sc.nextInt();

        do{
            System.out.print("Please Enter your age : ");
            age = sc.nextInt();
        } while(age < 0 || age > 100);
        System.out.println("Your age is : "+age);
        sc.close();
    }
}
