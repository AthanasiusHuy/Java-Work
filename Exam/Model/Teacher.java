package Model;

public class Teacher {
    private int teacherId;
    private String teacherName;
    private String numberPhone;
    private String address;
    private double salary;
    private int workDay;

    public Teacher(int teacherId, String teacherName, String numberPhone, String address, double salary, int workDay) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.numberPhone = numberPhone;
        this.address = address;
        this.salary = salary;
        this.workDay = workDay;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public void Print() {
        System.out.println("ID: " + teacherId);
        System.out.println("NAME: " + teacherName);
        System.out.println("PHONE: " + numberPhone);
        System.out.println("ADDRESS: " + address);
        System.out.println("SALARY: " + salary + "VND");
        System.out.println("WORK DAY: " + workDay);
    }

}
