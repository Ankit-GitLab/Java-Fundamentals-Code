package OPPs2.Access_Modifiers.For_Notes;

/**
 * 1. private
 *    - Sirf usi class ke andar access ho sakta hai.
 *    - Baaki kisi class ya subclass se access nahi ho sakta.
 *    - Mostly encapsulation ke liye use hota hai (data ko hide karne ke liye).
 *
 * ✅ Example:
 * Niche humne ek class mein private variable `age` banaya hai.
 * Usko hum sirf usi class ke andar access kar pa rahe hain.
 * Agar kisi doosri class se direct access karoge to error aayega.
 */
public class Private {
    // private variable - sirf is class ke andar hi accessible
    private int age = 20;

    // public method ke through private variable ko access kar rahe hain
    public void showAge() {
        System.out.println("Private variable age: " + age);
    }

    public static void main(String[] args) {
        System.out.println("🙏 Welcome to the Private access modifier example!");

        // Object banaya
        Private obj = new Private();

        // Private variable ko access kiya public method ke through
        obj.showAge();
    }
}
