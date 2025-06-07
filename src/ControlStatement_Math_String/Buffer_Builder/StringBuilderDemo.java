package ControlStatement_Math_String.Buffer_Builder;

public class StringBuilderDemo {

    public static void main(String[] args) {

        // 1. append() - Adds text to the end
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" Moto");
        System.out.println("1. append(): " + sb1);  // Output: Hello Moto

        // 2. insert() - Inserts text at a specific position
        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.insert(5, " Java");  // Insert after "Hello"
        System.out.println("2. insert(): " + sb2);  // Output: Hello Java

        // 3. replace() - Replaces part of the string
        StringBuilder sb3 = new StringBuilder("Hello Java");
        sb3.replace(6, 10, "Moto"); // Replace "Java" with "Moto"
        System.out.println("3. replace(): " + sb3);  // Output: Hello Moto

        // 4. delete() - Deletes characters from start index to end index (exclusive)
        StringBuilder sb4 = new StringBuilder("Hello Moto");
        sb4.delete(5, 10); // Delete " Moto"
        System.out.println("4. delete(): " + sb4);  // Output: Hello

        // 5. reverse() - Reverses the string
        StringBuilder sb5 = new StringBuilder("Ankit");
        sb5.reverse();
        System.out.println("5. reverse(): " + sb5);  // Output: tiknA

        // 6. toString() - Converts StringBuilder to String
        StringBuilder sb6 = new StringBuilder("Moto");
        String str = sb6.toString();
        System.out.println("6. toString(): " + str);  // Output: Moto

        // 7. setCharAt() - Changes a specific character
        StringBuilder sb7 = new StringBuilder("Java");
        sb7.setCharAt(0, 'S'); // Change 'J' to 'S'
        System.out.println("7. setCharAt(): " + sb7);  // Output: Sava

        // 8. length() - Returns the number of characters
        StringBuilder sb8 = new StringBuilder("Moto");
        int len = sb8.length();
        System.out.println("8. length(): " + len);  // Output: 4
    }
}

