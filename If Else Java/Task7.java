import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for absolute: ");
        int abs = scanner.nextInt();
        if (abs >= 0) {
            System.out.println("Result: " + abs);
        } else {
            System.out.println("Result: " + (-abs));
        }
    }
}
