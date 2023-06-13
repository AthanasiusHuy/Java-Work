package Model.Type;

import Model.Employee;

public class Programmer extends Employee {
    private int overtimeHours;

    public Programmer(String employeeCode, String fullName, int age, String phoneNumber, String email,
            double basicSalary, int overtimeHours) {
        super(employeeCode, fullName, age, phoneNumber, email, basicSalary);
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + (overtimeHours * 400000);
    }
}
