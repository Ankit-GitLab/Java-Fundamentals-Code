package ControlStatement_Math_String.Break_Continue;

public class BreakContinue {
    public static void main(String[] args) {
        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // If i is 5, skip this iteration
            if (i == 5) {
                continue; // Skip printing 5
            }

            // If i is 8, exit the loop
            if (i == 8) {
                break; // Exit the loop
            }

            // Print the value of i
            System.out.println(i);
        }
    }
}
