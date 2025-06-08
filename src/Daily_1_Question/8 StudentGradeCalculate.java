package Daily_1_Question;
import java.util.Scanner;

// Define the Student class
class Student {
    // Instance variables
    String name;
    int rollNumber;
    int[] marks;

    // Constructor to initialize all fields
    Student(String name, int rollNumber, int[] marks) {
        this.name = name;                 // Assign name
        this.rollNumber = rollNumber;     // Assign roll number
        this.marks = marks;               // Assign marks array
    }

    // Method to calculate average of marks
    double calculateAverage() {
        int sum = 0;                      // Initialize sum to 0
        for (int mark : marks) {          // Loop through each mark
            sum += mark;                  // Add mark to sum
        }
        return sum / 5.0;                 // Return average (sum / 5)
    }

    // Method to return grade based on average
    char getGrade() {
        double avg = calculateAverage();  // Get average
        if (avg >= 90) return 'A';        // Grade A
        else if (avg >= 80) return 'B';   // Grade B
        else if (avg >= 70) return 'C';   // Grade C
        else if (avg >= 60) return 'D';   // Grade D
        else return 'F';                  // Grade F
    }
}

class StudentGradeCalculate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner object for input

        // Take name input
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Take roll number input
        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();

        // Create array for 5 marks
        int[] marks = new int[5];
        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();      // Take each mark input
        }

        // Create Student object
        Student student = new Student(name, rollNumber, marks);

        // Display results
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Average Marks: " + student.calculateAverage());
        System.out.println("Grade: " + student.getGrade());

        sc.close(); // Close the scanner
    }
}
