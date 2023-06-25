package Util;

import Model.Type.Student;

import java.util.Comparator;
import java.util.Scanner;

public class StudentDB extends PersonDB<Student> {
    public static final String Comparators = null;

    public StudentDB() {
        super();
    }

    @Override
    public Student getPerson() {
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

        Student student = new Student(studentId, studentName, numberPhone, address, batch, mark1, mark2);
        personList.add(student);

        return student;
    }

    public void printStudentByAverageMark() {
        sortByProperty(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                double avgMark1 = s1.getAvgMark();
                double avgMark2 = s2.getAvgMark();
                return Double.compare(avgMark2, avgMark1);
            }
        });

        System.out.println("\nStudent List (Sorted by Average Mark):");
        for (Student s : personList) {
            s.print();
            s.printAverageMark();
            System.out.println();
        }
    }
}
