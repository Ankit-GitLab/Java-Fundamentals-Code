package ControlStatement_Math_String.CHALLENGE;

class StringManipulation {
 public static void main(String[] args) {

  // Declare first and last name
  String firstName = "Ankit";
  String lastName  = "Kumar";

  // Concatenate first and last name with a space
  String fullName = firstName.concat(" ").concat(lastName);

  // Print full name
  System.out.println("Full Name: " + fullName);

  // Print full name in uppercase
  System.out.println("Uppercase: " + fullName.toUpperCase());
 }
}
