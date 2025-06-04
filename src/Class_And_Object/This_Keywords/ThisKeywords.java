package Class_And_Object.This_Keywords;

public class ThisKeywords {

    int x; // instance variable

    // Constructor
    ThisKeywords(int x) {
        this.x = x; // 'this.x' refers to the instance variable, 'x' is the parameter
    }

    public void display() {
        System.out.println("Instance Variable x: " + this.x); // 'this.x' refers to the instance variable
    }

    public static void main(String[] args) {
        ThisKeywords obj = new ThisKeywords(10);
        obj.display();  // Output: Instance Variable x: 10
    }
}
