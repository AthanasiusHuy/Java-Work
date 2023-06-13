import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleDB {
    public static List<Vehicle> vehicleList = new ArrayList<>();

    public static Vehicle getVehicle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Engine Capacity (cc): ");
        int engineCapacity = scanner.nextInt();
        System.out.print("Car Value: ");
        double carValue = scanner.nextDouble();
        scanner.nextLine();
        return new Vehicle(model, engineCapacity, carValue);
    }

    public static void getVehicleTax(String searchModel) {
        boolean found = false;
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getModel().equalsIgnoreCase(searchModel)) {
                double tax = vehicle.calculateTax();
                System.out.println("Tax return for vehicle model " + searchModel + ": " + tax);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Vehicle model not found.");
        }
    }
}
