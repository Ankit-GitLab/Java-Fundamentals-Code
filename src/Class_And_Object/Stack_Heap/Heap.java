package Class_And_Object.Stack_Heap;

public class Heap {

    public static void main(String[] args) {
        // Object create kar rahe ho, to wo heap memory mein store hota hai
        Student s1 = new Student("Ankit", 246003); // 's1' reference stack mein, object heap mein
        s1.display(); // object ke method ko call kar rahe hain
    }
}

class Student {
    String name;  // ye fields heap mein store hoti hain
    int rollNo;

    // Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}
