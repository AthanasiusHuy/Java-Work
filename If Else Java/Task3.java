import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity: ");
        int quan = scanner.nextInt();
        int total = quan * 100;
        if (quan > 10) {
            System.out.println("Price " + (total - (total * 10 / 100)));
        } else {
            System.out.println("Price " + total);
        }
    }
}
