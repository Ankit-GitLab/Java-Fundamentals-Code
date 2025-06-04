package Conditonal;
import java.util.Scanner;
public class SquareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length : ");
        int length = sc.nextInt();
        System.out.print("Enter breath : ");
        int breath = sc.nextInt();
        if(length==breath){
            System.out.println(" yes Square");
        }
        else{
            System.out.println("not square");
        }
            sc.close();
    }
}
