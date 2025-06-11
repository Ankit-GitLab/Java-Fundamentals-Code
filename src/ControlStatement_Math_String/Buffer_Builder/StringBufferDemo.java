package ControlStatement_Math_String.Buffer_Builder;


public class StringBufferDemo {
    public static void main(String[] args) {

        // 1. append() - Add text at the end
        StringBuffer sb1 = new StringBuffer("Hello");
        sb1.append(" Moto");
        System.out.println("1. append(): " + sb1);  // Output: Hello Moto

        // 2. insert() - Insert at a specific index
        StringBuffer sb2 = new StringBuffer("Hello");
        sb2.insert(5, " Java");
        System.out.println("2. insert(): " + sb2);  // Output: Hello Java

        // 3. replace() - Replace a range
        StringBuffer sb3 = new StringBuffer("Hello Java");
        sb3.replace(6, 10, "Moto");
        System.out.println("3. replace(): " + sb3); // Output: Hello Moto

        // 4. delete() - Delete characters
        StringBuffer sb4 = new StringBuffer("Hello Moto");
        sb4.delete(5, 10);
        System.out.println("4. delete(): " + sb4);  // Output: Hello

        // 5. reverse() - Reverse the string
        StringBuffer sb5 = new StringBuffer("Ankit");
        sb5.reverse();
        System.out.println("5. reverse(): " + sb5); // Output: tiknA

        // 6. setCharAt() - Change a character at index
        StringBuffer sb6 = new StringBuffer("Java");
        sb6.setCharAt(0, 'S');
        System.out.println("6. setCharAt(): " + sb6); // Output: Sava

        // 7. length() - Get the length
        StringBuffer sb7 = new StringBuffer("Moto");
        System.out.println("7. length(): " + sb7.length()); // Output: 4

        // 8. toString() - Convert to String
        String str = sb7.toString();
        System.out.println("8. toString(): " + str); // Output: Moto
    }
}

