package ControlStatement_Math_String.To_String_Method;

public class StringFormatInAllInOne {

    public static void main(String[] args) {
        // Declare variables of different data types
        String name = "Ankit";
        int age = 20;
        float marks = 95.75f;
        char grade = 'A';
        boolean passed = true;

        // Print using formatted output
        System.out.printf("Name     : %s\n", name);     // %s for string
        System.out.printf("Age      : %d\n", age);      // %d for integer
        System.out.printf("Marks    : %.2f\n", marks);  // %.2f for float (2 decimal places)
        System.out.printf("Grade    : %c\n", grade);    // %c for character
        System.out.printf("Passed   : %b\n", passed);   // %b for boolean
    }
}

