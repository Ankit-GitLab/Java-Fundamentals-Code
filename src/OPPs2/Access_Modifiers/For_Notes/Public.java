package OPPs2.Access_Modifiers.For_Notes;

/**
 * public
 *    - Kahin se bhi access ho sakta hai (kisi bhi class, kisi bhi package se).
 *    - Jab kisi cheez ko fully accessible banana ho to use karte hain.
 *
 * 🧠 Key Points:
 * public se members (methods, variables, ya classes) kisi bhi class se, kisi bhi
 * package se access kiye ja sakte hain.
 * Jab tumhe kisi cheez ko poori tarah se accessible banana ho, tab public ka use
 * karte hain.
 */

// Public class with a public variable and method
public class Public {
    // public variable
    public int number = 100;

    // public method
    public void show() {
        System.out.println("Public variable number: " + number);
    }

    public static void main(String[] args) {
        System.out.println("🙏 Welcome to the Public access modifier example!");

        // Creating an object of Public class
        Public obj = new Public();
        obj.show(); // Accessing the public method
    }
}
