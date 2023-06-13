import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            Student student = StudentDB.getStudent();
            StudentDB.studentList.add(student);
        }
        Collections.sort(StudentDB.studentList);
        for (Student student : StudentDB.studentList) {
            System.out.println(student);
        }
    }
}