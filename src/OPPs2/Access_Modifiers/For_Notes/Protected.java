package OPPs2.Access_Modifiers.For_Notes;

/**
 * protected
 *    - Same package ke andar access ho sakta hai.
 *    - Dusre package ke subclass mein bhi access ho sakta hai.
 *    - Inheritance ke liye useful hai.
 *
 * 🧠 Key Concepts of protected:
 * Same Package: A protected member (variable or method) is accessible from any
 * class in the same package, including the subclass.
 *
 * Different Package: A protected member can only be accessed by a subclass
 * (not directly).
 *
 * Inheritance: The primary use of protected is to allow access to members of
 * a parent class from its subclass, even if they are in different packages.
 */
class Parent {
    // protected variable
    protected int number = 50;

    // protected method
    protected void show() {
        System.out.println("Protected variable number: " + number);
    }
}

// Child class inheriting the Parent class
class Child extends Parent {
    // Method to display the inherited protected variable and method
    void display() {
        System.out.println("Accessed from Child class - number: " + number);
        show();  // Calling inherited protected method
    }
}

public class Protected {
    public static void main(String[] args) {
        System.out.println("🙏 Welcome to the Protected access modifier example!");

        // Creating object of Child class
        Child obj = new Child();
        obj.display(); // Accessing protected method and variable from Parent class through Child class
    }
}
