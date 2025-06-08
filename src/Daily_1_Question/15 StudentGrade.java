package Daily_1_Question;
import java.util.Scanner;
class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for the student's name
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine(); // Reading student's name

        int[] marks = new int[5];
        int totalMarks = 0;


        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt(); // Reading marks
            totalMarks += marks[i]; // Adding marks to total
        }

        // Calculating average percentage
        double percentage = totalMarks / 5.0;

        // Declaring grade variable
        char grade;


        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Printing the result
        System.out.println("\n----- Student Report -----");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.println("Average Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
