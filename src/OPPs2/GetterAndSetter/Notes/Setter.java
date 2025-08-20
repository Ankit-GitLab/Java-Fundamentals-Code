package OPPs2.GetterAndSetter.Notes;

/**
 * 📘 Setter Methods in Java
 *
 * 🔹 Setter Kya Hota Hai?
 * - Setter ek method hota hai jo kisi class ke private variable ki
 *   value set (change) karne ke liye use hota hai.
 * - Ye bhi encapsulation ka part hai — data ko direct access na karke,
 *   method ke through change karte hain.
 *
 * 🔹 Setter Kyu Use Karte Hain?
 * - Private variables ki value bahar se safely change karne ke liye.
 * - Data pe control rakhne ke liye.
 * - Validation lagana ho (e.g., negative value allow na ho) — wo bhi
 *   setter ke through ho sakta hai.
 *
 * 🔹 Naming Convention
 * - Method ka naam `set` se start hota hai + field name ka first letter capital hota hai.
 * 📝 Example:
 * - setName(String name) → for name
 * - setModel(String model) → for model
 *
 * 🔹 Real-World Analogy
 * - Socho aapke paas ek form hai:
 * - Aap us form me name, email, etc. set karte ho.
 * - Ye values setter methods ke through set hoti hain.
 *
 * 🔹 Setter Kab Use Karein?
 * - Jab aapko kisi private variable ki value change karni ho.
 * - Jab aapko input validation lagani ho (e.g., fuel level 0 se zyada hona chahiye).
 * - Jab aapko program me data update karne ki flexibility chahiye ho.
 */
public class Setter {
    public static void main(String[] args) {
        System.out.println("Welcome (🙏) to Setter notes");
    }
}
