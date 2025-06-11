package ControlStatement_Math_String.Final_Keyword;



public class FinalVariable {

    // Declaring a final variable means its value can't be changed after initialization
    final double PI = 3.1412;

    // Non-static method
    void testing() {
        System.out.println("Before Change : "+PI);  // Prints the value of PI

        // PI = 56;  // This line is commented because it would cause a compile-time error
        // You can't assign a new value to a final variable

        System.out.println("After change : "+PI);  // Prints the same value again
    }

    public static void main(String[] args) {
        // Creating an object to call the non-static method
        FinalVariable obj = new FinalVariable();
        obj.testing();  // Calls the method to print PI twice
    }
}
