package OOPs.OOps_Principle;

/**
 *    Encapsulation -->
 *     Meaning: Data (variables) aur methods (functions)
 *     ko ek hi class ke andar bind karna.
 *     Example : Ek medicine capsule jisme sab kuch ek jagah band hota
 *     hai — waise hi data aur methods ek class mein.
 */
public class Encapsulation {
    private String name; // private = restricted access

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation(); // Object banaya

        obj.setName("Ankit Kumar"); // Name set kiya
        System.out.println("Name: " + obj.getName()); // Output: Name: Ankit Kumar
    }
}

