import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 digit");
        int digit = scanner.nextInt();
        int num1 = digit / 100;
        int num2 = (digit % 100) / 10;
        int num3 = (digit % 10);
        System.out.println(num3 * 100 + num2 * 10 + num1);
    }
}
