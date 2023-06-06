import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter years of service: ");
        int yrs = scanner.nextInt();
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();
        if (yrs > 5) {
            System.out.println("Bonus: " + salary * 5 / 100);
        } else {
            System.out.println("Bonus: 0");
        }
    }
}
