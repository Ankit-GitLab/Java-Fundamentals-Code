package OOPs.Access_Modifiers.Import;

// Car class ko dusre package se import kiya
import OOPs.Access_Modifiers.For_coding.Car;
// import OOPs.Access_Modifiers.For_coding.Default; // ❌ This line is commented because 'Default' has default access

public class DefaultTest {
    public static void main(String[] args) {

        // ✅ public constructor use karke object banaya
        Car car = new Car("yellow", "Dezire", 5, 30000);

        // ❌ Agar tum try karoge 'Default' class ka object banane ka,
        // to error aayega kyunki 'Default' class ka access modifier default hai
        // aur default classes sirf same package mein accessible hoti hain.

        // Default def = new Default(); // ❌ Compile-time error if uncommented
    }
}
