import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDB {
    public static List<Student> studentList = new ArrayList<>();

    public static Student getStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        return new Student(id, fullName, address, phoneNumber);
    }

}
