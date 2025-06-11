package ControlStatement_Math_String.Break_Continue;

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // If  3, skip this iteration
            if (i == 3) {
                continue; // Skip number 3
            }
            System.out.println(i); // Print other numbers
        }
    }
}
