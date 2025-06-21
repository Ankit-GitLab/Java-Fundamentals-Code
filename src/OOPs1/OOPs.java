package OOPs1;

// Pen class with color and type attributes
class Pen {
    String color;
    String type;

    // Method to simulate writing
    public void write() {
        System.out.println("writing something");
    }

    // Method to print the color of the pen
    public void printColor() {
        System.out.println(this.color);
    }
}

// Student class
class Student {
    String name;
    int age;

    // Default constructor (important to create s1)
    Student() {
        // Can initialize default values if needed
    }

    // Method to print student info
    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Copy constructor: copies data from another Student object
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

}

public class OOPs {
    public static void main(String[] args) {

        // Creating first student object using default constructor
        Student s1 = new Student();
        s1.name = "Ankit"; // Setting name
        s1.age = 18;       // Setting age

        // Creating second student object using copy constructor
        Student s2 = new Student(s1);

        // Printing s1's info
        s2.printInfo();
    }
}
