package Class_And_Object.Code_Blocks;

public class Scope {
    public static void main(String[] args) {
        if (true) {
            int num = 100; // 'num' has block scope — accessible only inside this 'if' block
            System.out.println(num); //  This works
        }

        // System.out.println(num); // Error: 'num' cannot be accessed outside the 'if' block
    }
}
