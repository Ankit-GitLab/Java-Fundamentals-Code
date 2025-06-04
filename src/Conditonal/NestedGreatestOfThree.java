package Conditonal;
import java.util.Scanner;
public class NestedGreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        double a = sc.nextDouble();
        System.out.print("Enter b : ");
        double b = sc.nextDouble();
        System.out.print("Enter c : ");
        double c = sc.nextDouble();
        if(a>b){
            if(a>c)
                System.out.println("A is greater : "+a);
            else
                System.out.println("C is greater : "+c);
        }
        else{
            if(b>c)
                System.out.println("B is greater : "+b);
            else
                System.out.println("C is greater : "+c);
        }
        sc.close();
    }
}
