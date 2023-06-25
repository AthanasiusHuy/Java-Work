import java.util.Scanner;

import Model.Type.Student;
import Model.Type.Teacher;
import Util.StudentDB;
import Util.TeacherDB;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean isRunning = true;

        StudentDB studentDB = new StudentDB();
        TeacherDB teacherDB = new TeacherDB();

        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. Enter student information");
            System.out.println("2. Enter teacher information");
            System.out.println("3. Print all students");
            System.out.println("4. Print all teachers");
            System.out.println("5. Sort Student by Average Mark");
            System.out.println("6. Sort Teacher in Alphabetical Order");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Student student = studentDB.getPerson();
                    studentDB.addPerson(student);
                    break;
                case 2:
                    Teacher teacher = teacherDB.getPerson();
                    teacherDB.addPerson(teacher);
                    break;
                case 3:
                    studentDB.printAllPersons();
                    break;
                case 4:
                    teacherDB.printAllPersons();
                    break;
                case 5:
                    studentDB.printStudentByAverageMark();
                    break;
                case 6:
                    teacherDB.printAllTeacherInAlphabeticalOrder();
                    break;
                case 7:
                    isRunning = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
