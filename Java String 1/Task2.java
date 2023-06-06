import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter second string: ");
        String string2 = scanner.nextLine();
        int result = string1.compareToIgnoreCase(string2);
        if (result < 0) {
            System.out.println("String 1 come first");
        } else if (result > 0) {
            System.out.println("String 2 come first");
        } else {
            System.out.println("Two Strings Equal");
        }
    }
}
