package Model.Type;

import Model.Employee;

public class Verifier extends Employee {
    private int errorNumberDetected;

    public Verifier(String employeeCode, String fullName, int age, String phoneNumber, String email, double basicSalary,
            int errorNumberDetected) {
        super(employeeCode, fullName, age, phoneNumber, email, basicSalary);
        this.errorNumberDetected = errorNumberDetected;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + (errorNumberDetected * 150000);
    }
}