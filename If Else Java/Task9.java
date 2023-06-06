import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning == true) {
            System.out.println("Enter year: ");
            int leapyear = scanner.nextInt();
            if (leapyear % 4 == 0) {
                if (leapyear % 100 == 0) {
                    if (leapyear % 400 == 0) {
                        System.out.println("A leap Year");
                    } else {
                        System.out.println("Not a leap year");
                    }

                } else {
                    System.out.println("A leap Year");
                }

            } else {
                System.out.println("Not a Leap Year");
            }
        }
    }
}
