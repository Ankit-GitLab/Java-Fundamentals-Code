package ControlStatement_Math_String.To_String_Method;

public class StringFormat {
    public static void main(String[] args) {
        // Declare and initialize variables
        String name = "Ankit";   // Name of the student
        int marks = 95;          // Marks scored

        // Print using string concatenation
        System.out.println("Hello " + name + ", your marks are : " + marks);

        // Print using formatted string (printf)
        System.out.printf("Hello %s, your marks are : %d", name, marks);
        // %s → for String, %d → for integer
    }
}
