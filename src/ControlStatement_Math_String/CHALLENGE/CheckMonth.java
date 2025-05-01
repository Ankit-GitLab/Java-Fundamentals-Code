package ControlStatement_Math_String.CHALLENGE;
import java.util.Scanner;
public class CheckMonth {
    public static void main(String[] args) {
        System.out.println("Welcome to Month of the Year detector");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check month : ");
        int month = sc.nextInt();
        monthNum(month);

    }

    public static void monthNum(int monthName){
        String monthStr = switch(monthName){
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
            default -> "Invalid Month";
        };
        System.out.println(monthStr);
    }
}
