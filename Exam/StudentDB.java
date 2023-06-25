import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Model.Student;

public class StudentDB {
    public static List<Student> studentList = new ArrayList<>();

    public static Student getStudent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the student name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter the student phone number: ");
        String numberPhone = scanner.nextLine();

        System.out.print("Enter the student address: ");
        String address = scanner.nextLine();

        System.out.print("Enter the batch: ");
        String batch = scanner.nextLine();

        System.out.print("Enter student mark 1: ");
        double mark1 = scanner.nextDouble();

        System.out.print("Enter student mark 2: ");
        double mark2 = scanner.nextDouble();

        scanner.nextLine();
        return new Student(studentId, studentName, numberPhone, address, batch, mark1, mark2);
    }

    public static void printAllStudent() {
        System.out.println("\nStudent List:");
        for (Student s : studentList) {
            s.Print();
            System.out.println();
        }
    }

    public static void printStudentbyAverageMark() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                double avgMark1 = s1.getAvgMark();
                double avgMark2 = s2.getAvgMark();
                return Double.compare(avgMark2, avgMark1);
            }
        });

        System.out.println("\nStudent List (Sorted by Average Mark):");
        for (Student s : studentList) {
            s.Print();
            s.PrintAverageMark();
            System.out.println();
        }
    }

}
