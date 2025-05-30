package Daily_1_Question;
import java.util.Scanner;
class VowelConsonantsCounter {
    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();  // Read the full line of text

        // Convert the string to lowercase to handle both uppercase and lowercase letters
        input = input.toLowerCase();

        // Initialize counters for vowels and consonants
        int vowels = 0;
        int consonants = 0;

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);  // Get the character at the current position

            // Check if the character is a letter (ignore spaces and symbols)
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;  // Increase vowel count
                } else {
                    consonants++;  // Increase consonant count
                }
            }
        }

        // Print the results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // Close the scanner
        sc.close();
    }
}
