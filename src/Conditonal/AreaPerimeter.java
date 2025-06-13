package Conditonal;
import java.util.Scanner;
public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of rectangle : ");
        int length = sc.nextInt();
        System.out.print("Enter the width of rectangle : ");
        int width = sc.nextInt();
        int area = length * width;
        int perimeter =  2 *(length+width);
        if(area > perimeter) {
            System.out.println("Area is greater than the perimeter is : "+perimeter);
        }
        else if(area == perimeter) {
            System.out.println("Area and perimeter are equal \n "+perimeter);
        }
        else {
            System.out.println("perimeter is greater than the area is : "+area);
        }
        sc.close();
    }
}
