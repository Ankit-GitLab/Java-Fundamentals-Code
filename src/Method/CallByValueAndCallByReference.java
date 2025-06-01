package Method;

public class CallByValueAndCallByReference {

    // Method to demonstrate Call by Value (for primitives)
    static void callByValue(int x) {
        x = x + 10;  // This change won't affect the original variable
        System.out.println("Inside callByValue, x = " + x);
    }

    // Method to simulate Call by Reference using an array (object)
    static void callByReference(int[] y) {
        y[0] = y[0] + 10;  // This will change the original value
        System.out.println("Inside callByReference, y[0] = " + y[0]);
    }

    public static void main(String[] args) {
        int a = 5;
        int[] b = {5};  // Using an array to simulate reference

        // Call by Value
        System.out.println("Before callByValue, a = " + a);
        callByValue(a);  // Passing a primitive type
        System.out.println("After callByValue, a = " + a);

        System.out.println();

        // Call by Reference (using array)
        System.out.println("Before callByReference, b[0] = " + b[0]);
        callByReference(b);  // Passing a reference type (array)
        System.out.println("After callByReference, b[0] = " + b[0]);
    }
}

