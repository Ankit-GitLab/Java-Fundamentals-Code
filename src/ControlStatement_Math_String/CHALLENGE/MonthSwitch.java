package ControlStatement_Math_String.CHALLENGE;

import java.util.Scanner;

public class MonthSwitch {
    public static void main(String[] args) {
        // Greeting message
        System.out.println("Welcome to Month mapping");

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your month number : ");

        // Reading integer input
        int monthNum = sc.nextInt();

        // Calling method to get the month name
        String monthName = getMonthName(monthNum);

        // Printing the result
        System.out.print(monthName);
    }

    // Method to return the month name for a given number
    public static String getMonthName(int monthName) {
        // Using switch expression to map number to month
        String monthStr = switch(monthName) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month";  // Handles invalid input
        };
        return monthStr;
    }
}
