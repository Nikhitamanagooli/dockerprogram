import java.util.Scanner;

public class grade {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter department: ");
        String department = scanner.nextLine();

        System.out.print("Enter semester: ");
        int semester = scanner.nextInt();

        // Input marks for three subjects
        System.out.print("Enter marks for Subject 1: ");
        int subject1Marks = scanner.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2Marks = scanner.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3Marks = scanner.nextInt();

        // Calculate average marks
        double averageMarks = (subject1Marks + subject2Marks + subject3Marks) / 3.0;

        // Determine grade
        char grade;
        if (averageMarks >= 90 && averageMarks <= 100) {
            grade = 'S';
        } else if (averageMarks >= 80) {
            grade = 'A';
        } else if (averageMarks >= 65) {
            grade = 'B';
        } else if (averageMarks >= 50) {
            grade = 'C';
        } else if (averageMarks >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display student details and grade
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Semester: " + semester);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);

        scanner.close();
}
}