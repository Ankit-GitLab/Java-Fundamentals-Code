package ControlStatement_Math_String.CHALLENGE;

class StudentToString {
 String name;
 int age;
 String rollNumber;
 String house;

 // Constructor to initialize student details
 public StudentToString(String name, int age, String rollNumber, String house) {
  this.name = name;
  this.age = age;
  this.rollNumber = rollNumber;
  this.house = house;
 }

 // Overriding toString() method to print student details
 @Override
 public String toString() {
  return "Student Details: { " +
          "Name: " + this.name + ", " +
          "Age: " + this.age + ", " +
          "Roll Number: " + this.rollNumber + ", " +
          "House: " + this.house +
          " }";
 }

 // Main method to test the class
 public static void main(String[] args) {
  StudentToString stu = new StudentToString("Ankit", 18, "246003", "Bihar");
  System.out.println(stu);  // Calls toString() automatically
 }
}
