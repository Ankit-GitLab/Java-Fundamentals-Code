package Class_And_Object.Variable_Scopes;

public class Scope {


    // Global (class-level) variable - accessible anywhere in this class
    static String root = "I'm available to all lines of code within my context";

    public static void main(String[] args) {
        // Local variable - only accessible inside main method
        String spy = "I'm a spy";

        System.out.println(root);       // ✅ OK - global variable
        System.out.println(spy);        // ✅ OK - local to main
        // System.out.println(anotherSpy); // ❌ ERROR - anotherSpy not in scope here
    }

    public static void helpfulFunction() {
        // Local variable - only accessible inside helpfulFunction method
        String anotherSpy = "I'm another spy";

        System.out.println(root);           // ✅ OK - global variable
        System.out.println(anotherSpy);     // ✅ OK - local to helpfulFunction
        // System.out.println(spy);         // ❌ ERROR - spy is not in scope here
    }
}

