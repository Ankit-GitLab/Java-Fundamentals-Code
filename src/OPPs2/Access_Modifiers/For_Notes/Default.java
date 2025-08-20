package OPPs2.Access_Modifiers.For_Notes;

/**
 * default (kuch bhi nahi likhte to default hota hai)
 *    - Sirf same package ke andar access ho sakta hai.
 *    - Package ke bahar se access nahi ho sakta.
 */

// 👇 Default access wali class
class DefaultExample {
    // default variable
    int number = 100;

    // default method
    void show() {
        System.out.println("Default variable number: " + number);
    }
}

// 👇 Is class ka naam 'DefaultMain' rakha gaya hai (to avoid conflict)
public class Default {
    public static void main(String[] args) {
        System.out.println("🙏 Welcome to the Default access modifier example!");

        // Object banaya aur default method ko call kiya
        DefaultExample obj = new DefaultExample();
        obj.show();
    }
}
