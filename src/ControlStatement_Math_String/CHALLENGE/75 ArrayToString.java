package ControlStatement_Math_String.CHALLENGE;

class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[] {"I", "study", "the", "core", "of", "java"};

        StringBuilder sb = new StringBuilder(); // Creates a new StringBuilder object

        for (String str : arr) {
            sb.append(str).append(" "); // Appends each word followed by a space
        }

        System.out.println(sb); // Prints the sentence with an extra space at the end
    }
}
