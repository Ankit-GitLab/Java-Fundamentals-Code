package ControlStatement_Math_String.To_String_Method;

public class StringClass {

    public static void main(String[] args) {
        // Declare and initialize a string
        String str = "Moto Java";

        // Find index of first 'o'
        int index1 = str.indexOf('o'); // 1
        System.out.println("Index of 'o': " + index1);

        // Get length of the string
        int len = str.length(); // length = 9
        System.out.println("Length: " + len);

        // Get character at index 0
        char ch = str.charAt(0); // 'M'
        System.out.println("Character at index 0: " + ch);

        // Get a substring from index 5 (starts from 'J')
        String sub = str.substring(5); // "Java"
        System.out.println("Substring from index 5: " + sub);

        // Convert to upper case
        String upper = str.toUpperCase(); // "MOTO JAVA"
        System.out.println("Uppercase: " + upper);

        // Convert to lower case
        String lower = str.toLowerCase(); // "moto java"
        System.out.println("Lowercase: " + lower);

        // Replace character 'o' with 'x'
        String replaced = str.replace('o', 'x'); // "Mxtx Java"
        System.out.println("Replaced 'o' with 'x': " + replaced);

        // Check if the string contains "Java"
        boolean found = str.contains("Java"); // true
        System.out.println("Contains 'Java': " + found);

        // Compare string with another string (case-sensitive)
        boolean isEqual = str.equals("Moto Java"); // true
        System.out.println("Equals 'Moto Java': " + isEqual);

        // Compare ignoring case
        boolean isEqualIgnore = str.equalsIgnoreCase("moto java"); // true
        System.out.println("EqualsIgnoreCase 'moto java': " + isEqualIgnore);

        // Check if string starts with "Moto"
        boolean starts = str.startsWith("Moto"); // true
        System.out.println("Starts with 'Moto': " + starts);

        // Check if string ends with "Java"
        boolean ends = str.endsWith("Java"); // true
        System.out.println("Ends with 'Java': " + ends);

        // Split the string by space
        String[] parts = str.split(" "); // ["Moto", "Java"]
        System.out.println("Split parts:");
        for (String part : parts) {
            System.out.println(part); // print each word
        }
    }
}
