package ControlStatement_Math_String.CHALLENGE;
import java.sql.SQLOutput;
import java.util.Scanner;
public class CheckScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Based on a student's score,categorize");
        System.out.print("Enter a number : ");
        int score = sc.nextInt();
        String category = (score > 80) ? "High" : (score >= 50) ? "Moderate" : "Low";
        System.out.println("Your score is ("+score+") then your category is : "+category);
    }
}
