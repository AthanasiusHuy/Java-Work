package Util;

import Model.Type.Teacher;

import java.util.Comparator;
import java.util.Scanner;

public class TeacherDB extends PersonDB<Teacher> {
    public TeacherDB() {
        super();
    }

    @Override
    public Teacher getPerson() {
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

        Teacher teacher = new Teacher(teacherId, teacherName, numberPhone, address, salary, workDay);
        personList.add(teacher);

        return teacher;
    }

    public void printAllTeacherInAlphabeticalOrder() {
        sortByProperty(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher t1, Teacher t2) {
                String name1 = t1.getName();
                String name2 = t2.getName();
                return name1.compareTo(name2);
            }
        });

        System.out.println("\nTeacher List (Sorted by Name):");
        for (Teacher t : personList) {
            t.print();
            System.out.println();
        }
    }
}
