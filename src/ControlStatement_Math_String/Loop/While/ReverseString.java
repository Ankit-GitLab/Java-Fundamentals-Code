package ControlStatement_Math_String.Loop.While;

public class ReverseString {

    public static void main(String[] args) {
        String original = "Ankit";
        String reversed = "";

        int i = original.length() - 1; // Start from last character

        // While loop to reverse string
        while (i >= 0) {
            reversed = reversed + original.charAt(i); // Add character from end
            i--; // Move backward
        }

        System.out.println("Reversed String: " + reversed);
    }
}

