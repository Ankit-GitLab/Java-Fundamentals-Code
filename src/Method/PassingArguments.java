package Method;
import java.util.Scanner;
public class PassingArguments {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String  Name = sc.next();
        System.out.print("Enter your Age : ");
        int age = sc.nextInt();
        System.out.print("Enter your class is : ");
        String Class = sc.next();
        intro(Name,age,Class);
    }
    public static void intro(String name, int age, String Class){
        System.out.println("Hello, "+name+" Your Age is "+age+" Your class is : "+Class);
    }
}
