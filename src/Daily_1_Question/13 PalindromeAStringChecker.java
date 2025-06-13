package Daily_1_Question;

class PalindromeChecker {

    public static void main(String[] args) {
        System.out.println("Welcome (🙆) to check the string is Palindrome or Not\n");
        // Input string to check
        String str = "racecar";

        // Call the method to check if it's a palindrome
        if (isPalindrome(str)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is NOT a Palindrome");
        }
    }


    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();


        int start = 0;
        int end = str.length() - 1;

        // Loop while start is less than end
        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }


        return true;
    }
}
