package Class_And_Object.Instance;

public class Method {
    // Instance variables
    String name;  // name of the student
    int age;      // age of the student

    // Constructor to initialize the instance variables
    Method(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Instance method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating objects of the Student class
        Method student1 = new Method("Ankit", 22);
        Method student2 = new Method("Rahul", 24);

        // Calling the instance method to display details
        student1.displayDetails();  // Output: Name: Ankit, Age: 22
        student2.displayDetails();  // Output: Name: Rahul, Age: 24
    }
}
