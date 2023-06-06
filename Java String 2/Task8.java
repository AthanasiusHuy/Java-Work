import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String string1 = scanner.nextLine();
        System.out.println("Enter second string: ");
        String string2 = scanner.nextLine();
        boolean isTrue = string1.equals(string2);

        if (isTrue) {
            System.out.println("The two strings have the same data.");
        } else {
            System.out.println("The two strings do not have the same data.");
        }
    }
}
