import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ax^2 + bx + c =0");
        boolean check = true;
        while (check == true) {
            System.out.println("Enter value a: ");
            double a = scanner.nextDouble();
            while (a == 0) {
                System.out.println("a cannot be 0. Please try again !");
                System.out.println("Enter value a: ");
                a = scanner.nextDouble();
            }
            System.out.println("Enter value b: ");
            double b = scanner.nextDouble();
            System.out.println("Enter value c: ");
            double c = scanner.nextDouble();

            double discriminant = (b * b - 4 * a * c);
            double x1 = 0;
            double x2 = 0;
            if (discriminant > 0) {
                x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
                x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
                System.out.println("TWO SOLUTIONS x1 = " + x1 + ", x2 = " + x2);
            } else if (discriminant == 0) {
                x1 = -b / 2 * a;
                System.out.println("ONE SOLUTION x = " + x1);
            } else if (discriminant < 0) {
                System.out.println("NO SOLUTION !");
            }
            System.out.println("Start ? (y/n)");
            scanner.nextLine();
            String result = scanner.nextLine();
            if (result.equalsIgnoreCase("y")) {
                check = true;
            } else if (result.equalsIgnoreCase("n")) {
                check = false;
            }
        }
        System.out.println("END PROGRAM");

    }

}
