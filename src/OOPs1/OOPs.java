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

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    // Method to print student info
    public void printInfo(String name, int age) {
        System.out.println(name+" "+age);

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

        s1.printInfo(s1.name,s1.age);
    }
}
