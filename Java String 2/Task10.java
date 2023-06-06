import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Enter character to replace: ");
        char oldChar = scanner.nextLine().charAt(0);
        System.out.println("Enter new character: ");
        char newChar = scanner.nextLine().charAt(0);
        String replace = str.replace(oldChar, newChar);
        System.out.println("Replaced string: " + replace);
    }
}
