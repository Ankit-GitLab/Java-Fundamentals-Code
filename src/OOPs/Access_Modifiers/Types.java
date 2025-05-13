package OOPs.Access_Modifiers;

/**
 * There are four main types of access modifiers in Java (and similar ones in other
 * object-oriented languages like C++ and Java). Access modifiers control the
 * visibility (accessibility) of classes, methods, and variables.
 *
 * 🔐 Types of Access Modifiers in Java:
 * 1. private
 *    - Accessible only within the same class.
 *    - Not visible to other classes, even subclasses.
 *    - Commonly used for encapsulation.
 *
 * 2. default (no modifier)
 *    - If no access modifier is specified, it is default (also called package-private).
 *    - Accessible only within the same package (not from outside the package).
 *
 * 3. protected
 *    - Accessible within the same package and in subclasses (even if they are in different packages).
 *    - Useful in inheritance.
 *
 * 4. public
 *    - Accessible from anywhere (any class in any package).
 *    - Used when you want something to be fully accessible.
 *
 * 🔍 Summary Table
 * Modifier    | Same Class | Same Package | Subclass (other package) | Other Packages
 * ------------|------------|--------------|---------------------------|----------------
 * private     | ✅         | ❌           | ❌                        | ❌
 * default     | ✅         | ✅           | ❌                        | ❌
 * protected   | ✅         | ✅           | ✅                        | ❌
 * public      | ✅         | ✅           | ✅                        | ✅
 */
public class Types {
    public static void main(String[] args) {
        System.out.println("🙏 Welcome! Let's explore the types of access modifiers.");
    }
}
