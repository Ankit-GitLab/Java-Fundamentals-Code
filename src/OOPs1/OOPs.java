package OOPs1;

class pen {
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }
}

public class OOPs {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Ankit";
        s1.age = 18;

        Student s2 = new Student(s1);
        s1.printInfo();
    }
}
