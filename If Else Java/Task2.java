import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Higest value" + a);
        } else if (b > a) {
            System.out.println("Highest value " + b);
        }

    }
}
