package Class_And_Object.Constructor.Chaining;

class Student {
    String name;
    int age;

    // Constructor 1
    Student() {
        this("Ankit", 20);  // yeh Constructor 2 ko call karega
        System.out.println("Default Constructor");
    }


    // Constructor 2
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized Constructor: " + name + ", " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();  // Constructor chaining start yahan se
    }
}

