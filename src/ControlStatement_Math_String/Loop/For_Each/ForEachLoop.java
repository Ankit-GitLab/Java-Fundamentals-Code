package ControlStatement_Math_String.Loop.For_Each;

public class ForEachLoop {
    public static void main(String[] args) {
        // Declare and initialize the array of names
        String[] array = new String[] {
                "Ankit", "Sohan", "Ram", "Shyam", "Mohan"
        };

        // Call method to print array using for-each loop
        printArrayForEach(array);

        // If needed, uncomment to print using regular for loop
        // printArray(array);
    }

    // Method to print array using for-each loop
    public static void printArrayForEach(String[] array) {
        for (String name : array) {
            System.out.println(name);
        }
    }

    // Method to print array using regular for loop
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
