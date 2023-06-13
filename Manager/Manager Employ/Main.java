import Model.Employee;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. Enter employee information");
            System.out.println("2. List employees with salaries below average");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Employee employee = EmployeeDB.getEmployee();
                    EmployeeDB.employeeList.add(employee);
                    break;

                case 2:
                    EmployeeDB.listEmployeesBelowAverageSalary();
                    break;

                case 3:
                    isRunning = false;
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
