//Write a Java program to find the ASCII value of a character.
package LOGICAL_QUSTION;
import java.util.*;
public class FindASCIIValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any character : ");
        char x = sc.next().charAt(0);
        System.out.print(x+"  ---> "+(int)x);
         sc.close();
    }
}
