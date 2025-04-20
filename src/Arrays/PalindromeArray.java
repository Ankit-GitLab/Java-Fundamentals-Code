package Arrays;

public class PalindromeArray {
 public static void main(String[] args) {
  System.out.println("Welcome to Palindrome Checker");
  int[] numArr = ArrayUtility.inputArray(); // Get input from user
  boolean isPalin = isPalindrome(numArr); // Check for palindrome
  if (isPalin) {
   System.out.println("Your array is palindrome");
  } else {
   System.out.println("Your array is not palindrome");
  }
 }

 public static boolean isPalindrome(int[] numArr) {
  int i = 0;
  while (i < numArr.length / 2) {
   if (numArr[i] != numArr[numArr.length - 1 - i]) {
    return false; // Not a palindrome
   }
   i++; // Move to next element
  }
  return true; // All matched
 }
}
