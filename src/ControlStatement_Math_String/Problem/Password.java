package ControlStatement_Math_String.Problem;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("   Welcome to set your password\n");
        boolean isValid;
        String password;
        do{
            System.out.print("Please Enter your password : ");
            password = sc.next();
        }while(!isValidPassword(password));
        System.out.println("Thanks for entering a valid password");
    }

    public static boolean isValidPassword(String password){
        return password.length() > 6;
    }
}
