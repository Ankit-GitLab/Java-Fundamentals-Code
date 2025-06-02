package Class_And_Object.Stack_Heap;

public class Stack {

    public static void main(String[] args) {
        int a = 5;              // 'a' stack mein store hoga
        int b = 10;             // 'b' bhi stack mein store hoga

        int result = add(a, b); // method call ke liye stack frame banega
        System.out.println("Result: " + result);
    }

    // ye method call hone par ek naya stack frame banega
    public static int add(int x, int y) {
        int sum = x + y;       // 'x', 'y', 'sum' sab stack mein store honge
        return sum;            // method khatam hone par stack frame remove ho jayega
    }
}
