import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digit;
        int num1, num4;
        System.out.println("Enter 5 digit");
        digit = scanner.nextInt();
        num1 = digit / 10000;
        num4 = (digit % 100) / 10;
        System.out.println(num1 + num4);

    }
}
