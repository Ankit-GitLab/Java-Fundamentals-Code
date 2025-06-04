package ControlStatement_Math_String.Switch;

import java.util.Scanner;

public class WeekDetector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object for input

        System.out.println("Welcome to Day of the week detector");

        System.out.print("Enter your day in number: ");  // Prompt user
        int day = sc.nextInt();  // Read integer input

        System.out.println("Here is the old Switch:");
        oldSwitch(day);  // Call old switch method

        System.out.println("Here is the new Switch:");
        newSwitch(day);  // Call new switch method
    }

    // ✅ Modern switch expression (Java 14+)
    public static void newSwitch(int day) {
        String dayStr = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day";
        };
        System.out.println(dayStr);  // ✅ Corrected variable name
    }

    // ✅ Traditional switch statement
    public static void oldSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }
}
