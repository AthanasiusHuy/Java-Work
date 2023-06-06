import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first person age: ");
        int a = scanner.nextInt();
        System.out.println("Enter second person age: ");
        int b = scanner.nextInt();
        System.out.println("Enter third person age: ");
        int c = scanner.nextInt();
        System.out.println("Oldest " + Math.max(a, Math.max(b, c)));
        System.out.println("Youngest " + Math.min(a, Math.min(b, c)));
    }
}
