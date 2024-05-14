//student details
public class StudentDetails {
    public static void main(String[] args) {
        // Student details (hard-coded)
        int rollNumber = 1;
        String studentName = "Nicchu";
        int mathMarks = 85;
        int physicsMarks = 78;
        int englishMarks = 92;

        // Calculate total marks and percentage
        int totalMarks = mathMarks + physicsMarks + englishMarks;
        float percentage = (float) totalMarks / 300 * 100;

        // Print student details
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + studentName);
        System.out.println("Math Marks: " + mathMarks);
        System.out.println("Physics Marks: " + physicsMarks);
        System.out.println("English Marks: " + englishMarks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
