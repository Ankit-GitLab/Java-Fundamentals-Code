package Conditonal;
import java.util.Scanner;
public class NestedThreeAndFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check divisible by 3 and 5 : ");
        int num = sc.nextInt();
        if(num%5==0){
            if(num%3==0){
                System.out.println(num+" is a divisible by 3 and 5");
            }
            else{
                System.out.println(num+" is a divisible by 5 and not divisible by 3");
            }
        }
        else{
            System.out.println(num+" is not a divisible by 3 and 5");
        }
        sc.close();
    }
}
