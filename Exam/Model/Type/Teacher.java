package Model.Type;

import Model.Person;

public class Teacher extends Person {
    private double salary;
    private int workDay;

    public Teacher(int id, String name, String phoneNumber, String address, double salary, int workDay) {
        super(id, name, phoneNumber, address);
        this.salary = salary;
        this.workDay = workDay;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    @Override
    public void print() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhoneNumber());
        System.out.println("Address: " + getAddress());
        System.out.println("Salary: " + salary);
        System.out.println("Work Day: " + workDay);
    }

}
