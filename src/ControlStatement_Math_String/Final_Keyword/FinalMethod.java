
package ControlStatement_Math_String.Final_Keyword;

class FinalMethod {

    final void show() {
        System.out.println("Hello");
    }
}

class B extends FinalMethod {
    // Cannot override the final method, but can create new methods
    void display() {
        System.out.println("Hi");
    }
}

class MainClass {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();    // Calls the final method from parent class
        obj.display(); // Calls the child class method
    }
}


