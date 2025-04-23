package Class_And_Object;

public class Course {

    static int maxCapacity = 100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    Course(String courseName){
        this.courseName = courseName;
        enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }


    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void setEnrolledStudent(String studentName){
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unrollStudent(String studentName){
        System.out.println("Student remove");
        enrollments--;
    }

    public static void main(String[] args) {

    }
}
