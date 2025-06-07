package Daily_1_Question;
import java.util.Scanner;
class VowelCounter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert the string to lowercase to handle both upper and lower case vowels
        input = input.toLowerCase();

        // Initialize a counter to store the number of vowels
        int vowelCount = 0;

        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++; // Increment the count if it's a vowel
            }
        }

        // Display the total number of vowels found
        System.out.println("Number of vowels: " + vowelCount);

        // Close the scanner to avoid memory leaks
        sc.close();
    }
}
