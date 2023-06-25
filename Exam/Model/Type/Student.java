package Model.Type;

import Model.Person;

public class Student extends Person {
    private String batch;
    private double mark1;
    private double mark2;

    public Student(int id, String name, String phoneNumber, String address, String batch, double mark1, double mark2) {
        super(id, name, phoneNumber, address);
        this.batch = batch;
        this.mark1 = mark1;
        this.mark2 = mark2;
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

    @Override
    public void print() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhoneNumber());
        System.out.println("Address: " + getAddress());
        System.out.println("Batch: " + batch);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }

    public double getAvgMark() {
        return (mark1 + mark2) / 2;
    }

    public void printAverageMark() {
        System.out.println("Average Mark: " + getAvgMark());
    }

}
