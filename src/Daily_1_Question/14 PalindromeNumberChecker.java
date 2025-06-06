package Daily_1_Question;

class PalindromeNumberChecker {
    public static void main(String[] args) {
        System.out.println("Welcome (🙆) to Code number palindrome checker\n");
        int number = 12321;

        // Check if the number is a palindrome
        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome number");
        } else {
            System.out.println(number + " is NOT a Palindrome number");
        }
    }


    public static boolean isPalindrome(int num) {
        int originalNumber = num;
        int reversed = 0;


        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }


        return originalNumber == reversed;
    }
}
