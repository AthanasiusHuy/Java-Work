import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDB {
    public static List<Student> studentList = new ArrayList<>();

    public static Student getStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the student age: ");
        int age = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter the course: ");
        String course = scanner.nextLine();

        System.out.print("Enter the student address: ");
        String address = scanner.nextLine();

        System.out.print("Enter student medium score: ");
        float mediumScore = scanner.nextFloat();
        scanner.nextLine();
        return new Student(id, name, age, course, address, mediumScore);
    }

    public static void printAllStudent() {
        System.out.println("\nStudent List:");
        for (Student s : studentList) {
            s.Print();
            System.out.println();
        }
    }

    public static void printMediumScores() {
        float totalScore = 0;
        int count = 0;

        System.out.println("Gradual List of Student Medium Score");

        for (Student student : studentList) {
            totalScore += student.getMediumScore();
            count++;
            float average = totalScore / count;

            System.out.println("Student: " + student.getName());
            System.out.println("Medium Score: " + student.getMediumScore());
            System.out.println("Average Medium Score: " + average);
            System.out.println();
        }
    }

    public static void findStudentsByCourse(String searchCourse) {
        boolean found = false;

        System.out.println("\nStudents in course " + searchCourse + ":");

        for (Student student : studentList) {
            if (student.getCourse().equalsIgnoreCase(searchCourse)) {
                student.Print();
                System.out.println();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No students found in course " + searchCourse + ".");
        }
    }

    public static void findStudentById(String searchId) {
        boolean found = false;

        for (Student student : studentList) {
            if (student.getId().equals(searchId)) {
                System.out.println("\nStudent found:");
                student.Print();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nStudent with ID " + searchId + " not found.");
        }
    }

}
