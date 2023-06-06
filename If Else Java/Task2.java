import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // bai 1
        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        if (length == width) {
            System.out.println("A Square");
        } else {
            System.out.println("Not a Square");
        }
        // bai 2
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Higest value" + a);
        } else if (b > a) {
            System.out.println("Highest value " + b);
        }
        // bai 3
        System.out.println("Enter quantity: ");
        int quan = scanner.nextInt();
        int total = quan * 100;
        if (quan > 10) {
            System.out.println("Price " + (total - (total * 10 / 100)));

        } else {
            System.out.println("Price " + total);
        }

        // bai 4
        System.out.println("Enter years of service: ");
        int yrs = scanner.nextInt();
        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();
        if (yrs > 5) {
            System.out.println("Bonus: " + salary * 5 / 100);
        } else {
            System.out.println("Bonus: 0");
        }

        // bai 5
        System.out.println("Enter Mark: ");
        int mark = scanner.nextInt();
        if (mark < 25) {

            System.out.println("GRADE F");
        } else if (mark >= 25 && mark < 45) {

            System.out.println("GRADE E");
        } else if (mark >= 45 && mark < 50) {
            System.out.println("GRADE D");
        } else if (mark >= 50 && mark < 60) {
            System.out.println("GRADE C");
        } else if (mark >= 60 && mark < 80) {
            System.out.println("GRADE B");
        } else if (mark >= 80) {
            System.out.println("GRADE A");
        }

        // bai 6
        System.out.println("Enter first person age: ");
        a = scanner.nextInt();
        System.out.println("Enter second person age: ");
        b = scanner.nextInt();
        System.out.println("Enter third person age: ");
        int c = scanner.nextInt();
        System.out.println("Oldest " + Math.max(a, Math.max(b, c)));
        System.out.println("Youngest " + Math.min(a, Math.min(b, c)));

        // bai 7
        System.out.println("Enter number for absolute: ");
        int abs = scanner.nextInt();
        if (abs >= 0) {
            System.out.println("Result: " + abs);
        } else {
            System.out.println("Result: " + (-abs));
        }

        // bai 8
        // a. true
        // b. true
        // c. true
        // d. true
        // e. false

        // bai 10
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
