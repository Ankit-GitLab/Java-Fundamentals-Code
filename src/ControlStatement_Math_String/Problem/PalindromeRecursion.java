package ControlStatement_Math_String.Problem;
import java.util.*;
public class PalindromeRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Palindrome Checker");
        System.out.print("Enter the string to be checker : ");
        String str = sc.next();
        System.out.println("Your string is "
                + (isPalindrome(str) ? "Palindrome" : "Not Palindrome"));
    }
    public static boolean isPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        int lastPos = str.length() - 1;
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1,lastPos);
        return isPalindrome(newStr);
    }
}
