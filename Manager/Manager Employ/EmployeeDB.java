import Model.Employee;
import Model.Type.Programmer;
import Model.Type.Verifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDB {
    public static List<Employee> employeeList = new ArrayList<>();

    //Input Employee
    public static Employee getEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Employee Code: ");
        String employeeCode = scanner.nextLine();
        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Employee Type (Programmer/Verifier): ");
        String employeeType = scanner.nextLine();

        Employee employee;
        if (employeeType.equalsIgnoreCase("Programmer")) {
            System.out.print("Overtime Hours: ");
            int overtimeHours = scanner.nextInt();
            scanner.nextLine();
            employee = new Programmer(employeeCode, fullName, age, phoneNumber, email, basicSalary, overtimeHours);
        } else if (employeeType.equalsIgnoreCase("Verifier")) {
            System.out.print("Error Number Detected: ");
            int errorNumberDetected = scanner.nextInt();
            scanner.nextLine();
            employee = new Verifier(employeeCode, fullName, age, phoneNumber, email, basicSalary, errorNumberDetected);
        } else {
            return null;
        }

        return employee;
    }

    //Find Employee
    public static void listEmployeesBelowAverageSalary() {
        double averageSalary = calculateAverageSalary();

        System.out.println("Employees with salaries below the average salary:");
        boolean foundEmployee = false;

        for (Employee employee : employeeList) {
            if (employee.getBasicSalary() < averageSalary) {
                employee.Print();
                System.out.println();
                foundEmployee = true;
            }
        }

        if (!foundEmployee) {
            System.out.println("No employees found");
        }
    }


    //Calculate Average Salary
    private static double calculateAverageSalary() {
        double totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getBasicSalary();
        }
        return totalSalary / employeeList.size();
    }
}