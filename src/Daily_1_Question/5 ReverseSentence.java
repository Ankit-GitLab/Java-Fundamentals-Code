package Daily_1_Question;
import java.util.Scanner;
class ReverseSentence {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter a sentence
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();  // Read the entire line of input

        // Split the input sentence into words using space as the delimiter
        String[] words = input.split(" ");

        // Print the words in reverse order
        System.out.print("Reversed sentence: ");
        for (int i = words.length - 1; i >= 0; i--) {  // Start from last word and move to the first
            System.out.print(words[i]);  // Print each word
            if (i != 0) {
                System.out.print(" ");  // Add space between words, not after the last word
            }
        }

        // Close the scanner to prevent memory leaks
        sc.close();
    }
}
