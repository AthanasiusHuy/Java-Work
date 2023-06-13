import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Vehicle {
    private String model;
    private int engineCapacity;
    private double carValue;

    public Vehicle(String model, int engineCapacity, double carValue) {
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.carValue = carValue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getCarValue() {
        return carValue;
    }

    public void setCarValue(double carValue) {
        this.carValue = carValue;
    }

    public double calculateTax() {
        if (engineCapacity < 100) {
            return carValue * 0.01;
        } else if (engineCapacity >= 100 && engineCapacity <= 200) {
            return carValue * 0.03;
        } else {
            return carValue * 0.05;
        }
    }

    public void Print() {
        System.out.println("MODEL: " + model);
        System.out.println("ENGINE CAPACITY: " + engineCapacity);
        System.out.println("VALUE: " + carValue);
    }
}
