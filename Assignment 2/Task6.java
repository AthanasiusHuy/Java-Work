import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter chart number: ");
        int n = scanner.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (j <= (n - i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println("");
        }
    }
}