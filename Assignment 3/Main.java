import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
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
                    Student student = StudentDB.getStudent();
                    StudentDB.studentList.add(student);
                    break;
                case 2:
                    StudentDB.printAllStudent();
                    break;
                case 3:
                    StudentDB.printMediumScores();
                    break;
                case 4:
                    System.out.print("\nEnter the course to search: ");
                    String searchCourse = scanner.nextLine();
                    StudentDB.findStudentsByCourse(searchCourse);
                    break;
                case 5:
                    System.out.print("\nEnter the student ID to search: ");
                    String searchId = scanner.nextLine();
                    StudentDB.findStudentById(searchId);
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
}