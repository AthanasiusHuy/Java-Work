import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scanner.nextLine();
        System.out.println("Enter string check: ");
        String end = scanner.nextLine();
        boolean isTrue = str.endsWith(end);

        if (isTrue) {
            System.out.println("String ends with specified ending.");
        } else {
            System.out.println("String does not end with specified ending.");
        }
    }
}
