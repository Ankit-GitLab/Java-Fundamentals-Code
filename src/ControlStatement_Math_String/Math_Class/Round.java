package ControlStatement_Math_String.Math_Class;

public class Round {
    public static void main(String[] args) {
        double x = 5.4;
        double y = 5.5;
        float z = 3.6f;

        // Using Math.round()
        System.out.println("Round of " + x + " is: " + Math.round(x)); // Output: 5
        System.out.println("Round of " + y + " is: " + Math.round(y)); // Output: 6
        System.out.println("Round of " + z + " is: " + Math.round(z)); // Output: 4
    }
}
