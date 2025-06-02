package Class_And_Object.Code_Blocks;

public class LocalVariables {
    public void display() {
        int x = 10; // local variable
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        LocalVariables obj = new LocalVariables();
        obj.display();
    }
}
