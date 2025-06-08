package BasicsOfJava;
import java.util.Scanner;
public class CharDataTypes {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter only (upper and lower case and special character) input : ");
    char ch = sc.next().charAt(0);// to char taking input 
    int x = (int)ch; // char convert into integer
    System.out.println(" ASCll value "+ch+" is "+x);
    sc.close();
   } 
}

