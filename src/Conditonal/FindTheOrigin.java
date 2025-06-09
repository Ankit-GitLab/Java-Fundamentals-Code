package Conditonal;
import java.util.Scanner;
public class FindTheOrigin {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter X-axis : ");
      int x = sc.nextInt();
      System.out.print("Enter Y-axis : ");
      int y = sc.nextInt();
      if(x==0 && y==0){
          System.out.println("The point is origin");
      }
      else if(x==0){
          System.out.println("The point lies on y-axis");
      }
      else if(y==0){
          System.out.println("The point  lies on x-axis");
      }
      else{
          System.out.println("The point is not lie on x-axis and y-axis");
      }
      sc.close();
    }
}
