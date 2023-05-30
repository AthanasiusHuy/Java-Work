import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value a: ");
        int a = scanner.nextInt();
        System.out.println("Enter value b: ");
        int b = scanner.nextInt();
        int c = 0;
        c = a;
        a = b;
        b = c;

        System.out.print(a + "," + b);
    }
}
