package OPPs2.GetterAndSetter.Notes;

/**
 * 📘 Getter vs Setter Methods in Java
 *
 * 🔹 Getter Method:
 * Purpose:
 *  - Getter method kisi class ke private variable ka value retrieve karne ke liye hota hai.
 *  - Ye encapsulation maintain karta hai aur data ko direct access karne se rokta hai.
 *
 * When to Use:
 *  - Jab aapko kisi private field ka value read karna ho.
 *  - Jab aap read-only behavior chahte ho.
 *
 * 🔹 Setter Method:
 * Purpose:
 *  - Setter method kisi class ke private variable ki value set (change) karne ke liye hota hai.
 *  - Ye bhi encapsulation ka part hai — data ko direct change na karke, method ke through update kiya jata hai.
 *
 * When to Use:
 *  - Jab aapko kisi private field ki value change karni ho.
 *  - Jab aapko input validation add karni ho (e.g., fuel level ko negative values na dena).
 *
 * 🔹 Key Differences Between Getter and Setter:
 *
 * Aspect               | Getter                                    | Setter
 * ---------------------|-------------------------------------------|-------------------------------
 * Purpose              | Returns the value of a private field.     | Sets the value of a private field.
 * Return Type          | Returns the value of the field (DataType).| Doesn't return anything (void).
 * Use Case             | Use when you want to read a private field's value. | Use when you want to update or modify a private field's value.
 * Example              | getColor() returns the color.             | setColor("Red") updates the color.
 * Control              | Allows read-only access.                  | Allows write or update access.
 * Naming Convention    | Starts with "get" followed by field name.| Starts with "set" followed by field name.
 *
 * 🔹 Real-World Example:
 *  - Getter: Jaise aap bank me apna balance dekhte ho — aap sirf dekh sakte ho, change nahi kar sakte.
 *  - Setter: Jaise aap apna bank account balance update karte ho — aap value set karte ho (e.g., deposit or withdraw).
 *
 * 🔹 When to Use Both?
 *  - Getter: Jab aap data ko read karte ho.
 *  - Setter: Jab aap data ko update karte ho ya validate karte ho.
 *
 * 🔹 Summary:
 *  - Getter: Read data from a private field.
 *  - Setter: Write or update data in a private field.
 */
public class GetterAndSetter {
    public static void main(String[] args) {
        System.out.println("Welcome (🙏) to Getter and Setter notes");
    }
}
