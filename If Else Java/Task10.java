import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 4 digit number: ");
        int digit = scanner.nextInt();
        int num1 = digit / 1000;
        int num2 = (digit / 100) % 10;
        int num3 = (digit / 10) % 10;
        int num4 = digit % 10;
        digit = num4 * 1000 + num3 * 100 + num2 * 10 + num1;

        System.out.println("Reversed number: " + digit);
    }
}
