package OPPs2.GetterAndSetter.Notes;

/**
 * 📘 Getter Methods in Java
 *
 * 🔹 Getter Kya Hota Hai?
 * - Getter ek method hota hai jo kisi class ke private field ko access
 *   karne ke liye use hota hai.
 * - Ye encapsulation maintain karta hai — yani data ko directly access
 *   karne se rokta hai.
 *
 * 🔹 Getter Kyu Use Karte Hain?
 * - Private variables ko safe tarike se access karne ke liye.
 * - Data ke access ko control karne ke liye.
 * - Agar sirf getter hai aur setter nahi, to value read-only hoti hai
 *   (change nahi kar sakte).
 *
 * 🔹 Naming Convention
 * - Method ka naam `get` se start hota hai + field name ka first letter
 *   capital hota hai.
 *   📝 Example:
 *   getName() → for name
 *   getModel() → for model
 *
 * 🔹 Real-World Example
 * - Getter ko aise samjho jaise bank balance inquiry:
 *   Aap balance dekh sakte ho (read),
 *   Lekin bina permission ke change nahi kar sakte (write nahi kar sakte).
 *
 * 🔹 Getter Kab Use Karein?
 * - Jab aapko private field ka value read karna ho.
 * - Jab aapko controlled access chahiye ho.
 * - Jab aap frameworks (jaise JavaBeans) ke saath kaam kar rahe ho,
 *   jahan getter important hote hain.
 */
public class Getter {
    public static void main(String[] args) {
        System.out.println("Welcome (🙏) to Getter notes");
    }
}
