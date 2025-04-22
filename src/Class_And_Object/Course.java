package Class_And_Object;

public class Course {

    // Static variable to store maximum capacity of the course
    static int maxCapacity = 100;

    // Instance variables for course name, current enrollment count, and student list
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    // Constructor to initialize course name and create array to store student names
    Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    // Static method to set new maximum capacity
    static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    // Method to enroll a student in the course
    void setEnrolledStudent(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName; // Add student to the list
            enrollments++; // Increment the enrollment count
        } else {
            System.out.println("Cannot enroll " + studentName + ". Course is full.");
        }
    }

    // Method to unroll/remove a student from the course
    void unrollStudent(String studentName) {
        boolean found = false; // Flag to check if student is found

        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                // Shift all students after the removed one to the left
                for (int j = i; j < enrollments - 1; j++) {
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }
                enrolledStudents[enrollments - 1] = null; // Clear the last student
                enrollments--; // Decrease the count
                found = true;
                System.out.println("Student removed: " + studentName);
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found: " + studentName);
        }
    }

    // Main method to test functionality
    public static void main(String[] args) {
        // Example usage
        Course javaCourse = new Course("Java Programming");

        javaCourse.setEnrolledStudent("Ankit");
        javaCourse.setEnrolledStudent("Ravi");

        javaCourse.unrollStudent("Ankit"); // Should remove Ankit
        javaCourse.unrollStudent("Sita");  // Should show "Student not found"
    }
}
