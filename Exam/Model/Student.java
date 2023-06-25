package Model;

public class Student {
    private int studentId;
    private String studentName;
    private String numberPhone;
    private String address;
    private String batch;
    private double mark1;
    private double mark2;

    public Student(int studentId, String studentName, String numberPhone, String address, String batch, double mark1,
            double mark2) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.numberPhone = numberPhone;
        this.address = address;
        this.batch = batch;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
    }

    public double getAvgMark() {
        return (mark1 + mark2) / 2.0;
    }

    public void Print() {
        System.out.println("ID: " + studentId);
        System.out.println("NAME: " + studentName);
        System.out.println("PHONE: " + numberPhone);
        System.out.println("ADDRESS: " + address);
        System.out.println("BATCH: " + batch);
        System.out.println("MARK 1: " + mark1);
        System.out.println("MARK 2: " + mark2);
    }

    public void PrintAverageMark() {
        System.out.println("AVERAGE MARK: " + getAvgMark());
    }

}
