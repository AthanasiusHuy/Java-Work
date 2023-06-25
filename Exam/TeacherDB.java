import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

import Model.Teacher;

public class TeacherDB {
    public static List<Teacher> teacherList = new ArrayList<>();

    public static Teacher getTeacher() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the teacher ID: ");
        int teacherId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the teacher name: ");
        String teacherName = scanner.nextLine();

        System.out.print("Enter the teacher phone number: ");
        String numberPhone = scanner.nextLine();

        System.out.print("Enter the teacher address: ");
        String address = scanner.nextLine();

        System.out.print("Enter teacher work day: ");
        int workDay = scanner.nextInt();

        double salary = workDay * 800000;

        scanner.nextLine();
        return new Teacher(teacherId, teacherName, numberPhone, address, salary, workDay);
    }

    public static void printAllTeacher() {
        System.out.println("\nTeacher List:");
        for (Teacher t : teacherList) {
            t.Print();
            System.out.println();
        }
    }

    public static void printAllTeacherInAlphabeticalOrder() {
        Collections.sort(teacherList, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher t1, Teacher t2) {
                String name1 = t1.getTeacherName();
                String name2 = t2.getTeacherName();
                return name1.compareTo(name2);
            }
        });

        System.out.println("\nTeacher List (Sorted by Name):");
        for (Teacher t : teacherList) {
            t.Print();
            System.out.println();
        }
    }
}
