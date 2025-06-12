package Class_And_Object.Static_KeyWords;

public class Static {
    static String schoolName = "ABC School";  // Static variable
    String studentName;

    Static(String name) {
        studentName = name;
    }

    public void display() {
        System.out.println(studentName + " studies at " + schoolName);
    }

    public static void main(String[] args) {
        Static s1 = new Static("Ankit");
        Static s2 = new Static("Moto");

        s1.display();
        s2.display();
    }
}
