import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax + b = 0");
        System.out.println("Enter value a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter value b: ");
        double b = scanner.nextDouble();
        double x = 0;
        x = -b / a;
        System.out.println("Value of x: " + x);
    }

}
