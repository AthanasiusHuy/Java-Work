import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = scanner.nextInt();
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        if (length == width) {
            System.out.println("A Square");
        } else {
            System.out.println("Not a Square");
        }
    }
}