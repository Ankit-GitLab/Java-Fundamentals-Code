package Conditonal;
import java.util.Scanner;
public class NestedAgeOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Ram Age : ");
        int RamAge = sc.nextInt();
        System.out.print("Enter Shyam Age : ");
        int ShyamAge = sc.nextInt();
        System.out.print("Enter Ajay Age : ");
        int AjayAge = sc.nextInt();
        if(RamAge > ShyamAge){
            if(RamAge > AjayAge){
                System.out.println("Ram Age is greater than Shyam Age and Ajay Age");
            }
            else{
                System.out.println("Ajay Age is greater than Ram Age and Shyam Age");
            }
        }
        else{
            if (ShyamAge > AjayAge){
                System.out.println("ShyamAge is greater than Ram Age and Ajay Age");
            }
            else{
                System.out.println("Ajay Age is greater than Ram Age and Shyam Age");
            }
        }
        sc.close();
    }
}
