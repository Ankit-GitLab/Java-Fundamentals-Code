package OOPs.Access_Modifiers.For_Notes;

/**
 * Java mein 4 main access modifiers hote hain jo ki kisi class, method ya variable ka
 * access control karte hain — matlab, kaun use dekh sakta hai ya use kar sakta hai.
 *
 * 🔐 Java ke Access Modifiers:
 *
 * 1. private
 * 2. default
 * 3. protected
 * 4. public
 *
 * 🔍 Summary Table:
 * Modifier     | Same Class | Same Package | Subclass (dusra package) | Other Packages
 * -------------|-------------|---------------|---------------------------|----------------
 * private      | ✅          | ❌            | ❌                        | ❌
 * default      | ✅          | ✅            | ❌                        | ❌
 * protected    | ✅          | ✅            | ✅                        | ❌
 * public       | ✅          | ✅            | ✅                        | ✅
 *
 * ✅ Short Summary :
 * - private   → Sirf usi class ke andar kaam karta hai.
 * - default   → Sirf same package ke andar kaam karta hai.
 * - protected → Same package + subclass (even alag package mein) mein kaam karta hai.
 * - public    → Sab jagah se access ho sakta hai.
 */
public class Types {
    public static void main(String[] args) {
        System.out.println("🙏 Welcome! Let's explore the types of access modifiers");
    }
}
