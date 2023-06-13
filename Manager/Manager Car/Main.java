import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Menu:");
            System.out.println("1. Create vehicle objects and enter information");
            System.out.println("2. Export the tax return of a vehicle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Vehicle vehicle = VehicleDB.getVehicle();
                    VehicleDB.vehicleList.add(vehicle);
                    break;

                case 2:
                    System.out.print("Enter the model of the vehicle: ");
                    String searchModel = scanner.nextLine();
                    VehicleDB.getVehicleTax(searchModel);
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