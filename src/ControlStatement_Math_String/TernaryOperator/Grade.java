package ControlStatement_Math_String.TernaryOperator;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome (🙏) to check the grade");

        // Ask the user for marks
        System.out.print("Please enter your marks: ");
        int marks = sc.nextInt(); // Read marks as an integer

        // Use nested ternary operator to determine the grade
        String grade = (marks >= 90) ? "A (😎)" :
                (marks >= 75) ? "B" :
                        (marks >= 60) ? "C" :
                                (marks >= 30) ? "D" : "Fail (😭)";

        // Print the grade
        System.out.println("Your grade is: " + grade);
    }
}

