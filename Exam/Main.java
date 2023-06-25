import java.util.Scanner;

import Model.Student;
import Model.Teacher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean isRunning = true;

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
                    Student student = StudentDB.getStudent();
                    StudentDB.studentList.add(student);
                    break;
                case 2:
                    Teacher teacher = TeacherDB.getTeacher();
                    TeacherDB.teacherList.add(teacher);
                case 3:
                    StudentDB.printAllStudent();
                    break;
                case 4:
                    TeacherDB.printAllTeacher();
                    break;
                case 5:
                    StudentDB.printStudentbyAverageMark();
                    break;
                case 6:
                    TeacherDB.printAllTeacherInAlphabeticalOrder();
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