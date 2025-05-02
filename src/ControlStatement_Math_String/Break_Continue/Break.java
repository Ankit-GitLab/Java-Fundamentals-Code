package ControlStatement_Math_String.Break_Continue;

public class Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // If i is 5, break the loop
            if (i == 5) {
                break; // Exit the loop
            }
            System.out.println(i); // Print numbers before 5
        }
    }
}
