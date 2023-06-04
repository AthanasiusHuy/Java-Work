import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    List<Student> studentlist = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        boolean isRunning = true;
        System.out.println("-- WELCOME TO SCHOOL LIST PROGRAM --");
        while (isRunning == true) {
            System.out.println("------------------------------------");
            System.out.println("1. Input Student");
            System.out.println("2. Show all Students");
            System.out.println("3. Average Score of Students");
            System.out.println("4. Search Course of All Student");
            System.out.println("5. Search Student from ID");
            System.out.println("6. Quit");
            System.out.println("------------------------------------");
            System.out.println("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Student student = getStudent();
                    studentList.add(student);
                    break;
                case 2:
                    System.out.println("\nStudent List:");
                    for (Student s : studentList) {
                        s.Print();
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("\nGradual List of Student Medium Scores:");
                    printMediumScores(studentList);
                    break;
                case 4:
                    System.out.print("\nEnter the course to search: ");
                    String searchCourse = scanner.nextLine();
                    findStudentsByCourse(studentList, searchCourse);
                    break;
                case 5:
                    System.out.print("\nEnter the student ID to search: ");
                    String searchId = scanner.nextLine();
                    findStudentById(studentList, searchId);
                    break;
                case 6:
                    isRunning = false;
                    System.out.println("End Program");
                    break;
                default:
                    System.out.println("Invalid Choice. Try again !");
                    break;
            }
        }

    }

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

    public static void printMediumScores(List<Student> studentList) {
        float totalScore = 0;
        int count = 0;

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

    public static void findStudentsByCourse(List<Student> studentList, String searchCourse) {
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

    public static void findStudentById(List<Student> studentList, String searchId) {
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